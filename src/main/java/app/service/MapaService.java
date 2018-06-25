package app.service;

import app.model.GeoCodingResponse;
import app.model.Mapa;
import app.repository.MapaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class MapaService {

    private Logger log = LoggerFactory.getLogger(MapaService.class);

    @Autowired
    private MapaRepository mapaRepository;

    @Autowired
    private GoogleApiService googleApiService;

    public void populateLatLng() throws IOException {
        List<Mapa> mapas = mapaRepository.findMapaByLatitudeAndLongitude(null,null);
        log.info(mapas.size() + " enderecos encontrados sem latitude e longitude definidos");

        int quant = 0;
        Double lat;
        Double lng;

        GeoCodingResponse geoCodingResponse;
        for (Mapa mapa : mapas){
            if (mapa.getEndereco_mapa_planta_novo() != null){
                geoCodingResponse = googleApiService.getGeoCode(mapa.getEndereco_mapa_planta_novo());

                if (geoCodingResponse.getStatus().equals("OK")){
                    lat = geoCodingResponse.getResults().get(0).getGeometry().getLocation().getLat();
                    log.info("Latitude: " + lat);
                    mapa.setLatitude(lat);
                    lng = geoCodingResponse.getResults().get(0).getGeometry().getLocation().getLng();
                    log.info("Longitude: " + lng);
                    mapa.setLongitude(lng);

                    try {
                        quant++;
                        mapaRepository.save(mapa);
                    } catch(Exception e) {
                        log.error(e.getMessage(), e);
                        log.info(quant + "enderecos modificados");
                    }
                }
            }
        }
        log.info(quant + "enderecos modificados");
    }

}
