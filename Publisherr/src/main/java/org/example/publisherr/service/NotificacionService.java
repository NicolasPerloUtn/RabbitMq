package org.example.publisherr.service;

import org.example.publisherr.domain.Mensaje;
import org.example.publisherr.domain.MensajeEntity;

import java.time.LocalDate;
import java.util.List;

public interface NotificacionService {

    MensajeEntity postNotificacion(Mensaje notificacion);

    List<MensajeEntity> getAllNotificaciones();

    List<MensajeEntity> getNotificacionesByFecha(LocalDate fechaDesde, LocalDate fechaHasta);

    List<MensajeEntity> getNotificacionByFecha(LocalDate fecha);
}
