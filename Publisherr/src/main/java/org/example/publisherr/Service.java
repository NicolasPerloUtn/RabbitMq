package org.example.publisherr;

import lombok.extern.slf4j.Slf4j;
import org.example.publisherr.domain.Mensaje;
import org.example.publisherr.domain.MensajeEntity;
import org.example.publisherr.repositories.MensajeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
@org.springframework.stereotype.Service
public class Service {
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
        mensajeRepository.save(modelMapper.map(message, MensajeEntity.class));
    }

    public List<MensajeEntity> getMensajes() {
        return mensajeRepository.findAll();
    }
}
