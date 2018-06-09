package repository;

import model.Mapa;
import org.springframework.data.repository.CrudRepository;

public interface MapaRepository extends CrudRepository<Mapa, Long> {

    Mapa findMapaByEndereco_mapa_planta_novo(String endereco_mapa_planta_novo);

    Mapa findMapaByLatitudeAndLongitude(String latitude, String longitude);

}
