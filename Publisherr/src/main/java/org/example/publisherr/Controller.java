package org.example.publisherr;

import org.example.publisherr.domain.Mensaje;
import org.example.publisherr.domain.MensajeEntity;
import org.example.publisherr.service.implementacion.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/prueba")
@CrossOrigin
public class Controller {
    @Autowired
    private ServiceImpl service;

//    @GetMapping("/message")
//    public void sendMessage(@RequestParam String message) {
//        service.sendToRabbit(message);
//    }

    @PostMapping("/message")
    public void sendMessage(@RequestBody Mensaje message) {
        service.sendToRabbit(message);
    }

    @GetMapping("/getNotificaciones")
    public List<MensajeEntity> getMensajes() {
        return service.getAllNotificaciones();
    }

    @GetMapping("/getNotificacionesByFecha")
    public List<MensajeEntity> getNotificacionesByFecha(@RequestParam LocalDate fechaDesde, @RequestParam LocalDate fechaHasta) {
        return service.getNotificacionesByFecha(fechaDesde, fechaHasta);
    }

    @GetMapping("/getNotificacionByFecha")
    public List<MensajeEntity> getNotificacionByFecha(@RequestParam LocalDate fecha) {
        return service.getNotificacionByFecha(fecha);
    }
}
