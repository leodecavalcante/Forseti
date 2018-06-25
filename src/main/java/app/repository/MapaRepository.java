package app.repository;

import app.model.Mapa;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MapaRepository extends CrudRepository<Mapa, Long> {

    List<Mapa> findMapaByLatitudeAndLongitude(Double latitude, Double longitude);
}
