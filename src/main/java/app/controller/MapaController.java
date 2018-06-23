package app.controller;

import app.service.MapaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class MapaController {

    private Logger log = LoggerFactory.getLogger(MapaController.class);

    @Autowired
    private MapaService mapaService;

    @RequestMapping(value = "set/latlng", method = RequestMethod.GET)
    public String populateLatLng(){
        log.info("Iniciando processo para popular banco");
        try {
            return mapaService.populateLatLng();
        } catch (IOException e) {
            log.error(e.getMessage(), e);
            return "Algum erro foi encontrado.";
        }
    }
}
