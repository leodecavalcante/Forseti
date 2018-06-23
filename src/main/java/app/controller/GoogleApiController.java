package app.controller;

import app.model.GeoCodingResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import app.service.GoogleApiService;

import java.io.IOException;

@RestController
public class GoogleApiController {

    private Logger log = LoggerFactory.getLogger(GoogleApiController.class);

    @Autowired
    private GoogleApiService googleApiService;

    @RequestMapping(value = "find/endereco/{endereco_mapa_planta_novo}", method = RequestMethod.GET)
    public GeoCodingResponse getGeoCode(@PathVariable String endereco_mapa_planta_novo){
        GeoCodingResponse geoCodingResponse = null;
        try {
             geoCodingResponse = googleApiService.getGeoCode(endereco_mapa_planta_novo);
        } catch (IOException e) {
            log.error(e.getMessage(), e);
        }
        return geoCodingResponse;
    }
}
