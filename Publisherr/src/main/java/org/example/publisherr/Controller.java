package org.example.publisherr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prueba")
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
}
