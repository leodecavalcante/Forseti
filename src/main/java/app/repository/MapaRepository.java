package app.repository;

import app.model.Mapa;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MapaRepository extends CrudRepository<Mapa, Long> {

    List<Mapa> findMapaByEndereco_mapa_planta_novo(String endereco_mapa_planta_novo);

    List<Mapa> findMapaByLatitudeAndLongitude(String latitude, String longitude);
}
