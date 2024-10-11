package org.example.publisherr.service.implementacion;

import lombok.extern.slf4j.Slf4j;
import org.example.publisherr.Publisher;
import org.example.publisherr.domain.Mensaje;
import org.example.publisherr.domain.MensajeEntity;
import org.example.publisherr.repositories.MensajeRepository;
import org.example.publisherr.service.NotificacionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@org.springframework.stereotype.Service
public class ServiceImpl implements NotificacionService {
    @Autowired
    private Publisher publisher;

    @Autowired
    private MensajeRepository mensajeRepository;

    @Autowired
    private ModelMapper modelMapper;

//    public void sendToRabbit(String message) {
//        log.info("Message '{}' enviado ... ", message);
//        this.publisher.send(message);
//    }

    public void sendToRabbit(Mensaje message) {
        log.info("Message '{}' enviado ... ", message);
        this.publisher.send(message);
        this.postNotificacion(message);
    }

    public MensajeEntity postNotificacion(Mensaje notificacion) {
        LocalDate fecha = LocalDate.now();
        notificacion.setFecha(fecha);
        return mensajeRepository.save(modelMapper.map(notificacion, MensajeEntity.class));
    }

    public List<MensajeEntity> getAllNotificaciones() {
        return mensajeRepository.findAll();
    }

    public List<MensajeEntity> getNotificacionesByFecha(LocalDate fechaDesde, LocalDate fechaHasta) {
        List<MensajeEntity> lista = mensajeRepository.findAll();
        List<MensajeEntity> notificacionesFecha = new ArrayList<>();

        for (MensajeEntity m : lista) {
            if (m.getFecha().isAfter(fechaDesde) && m.getFecha().isBefore(fechaHasta)) {
                notificacionesFecha.add(m);
            }
        }

        return notificacionesFecha;
    }

    public List<MensajeEntity> getNotificacionByFecha(LocalDate fecha) {
        List<MensajeEntity> lista = mensajeRepository.findAll();
        List<MensajeEntity> notificacionesFecha = new ArrayList<>();

        for (MensajeEntity m : lista) {
            if (m.getFecha().equals(fecha)) {
                notificacionesFecha.add(m);
            }
        }

        return notificacionesFecha;
    }
}
