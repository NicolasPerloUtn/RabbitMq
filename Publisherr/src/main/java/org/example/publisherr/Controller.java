package org.example.publisherr;

import org.example.publisherr.domain.Mensaje;
import org.example.publisherr.domain.MensajeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prueba")
@CrossOrigin
public class Controller {
    @Autowired
    private Service service;

//    @GetMapping("/message")
//    public void sendMessage(@RequestParam String message) {
//        service.sendToRabbit(message);
//    }

    @PostMapping("/message")
    public void sendMessage(@RequestBody Mensaje message) {
        service.sendToRabbit(message);
    }

    @GetMapping
    public List<MensajeEntity> getMensajes() {
        return service.getMensajes();
    }
}
