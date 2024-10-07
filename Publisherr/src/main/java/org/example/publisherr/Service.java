package org.example.publisherr;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private Publisher publisher;

//    public void sendToRabbit(String message) {
//        log.info("Message '{}' enviado ... ", message);
//        this.publisher.send(message);
//    }

    public void sendToRabbit(Mensaje message) {
        log.info("Message '{}' enviado ... ", message);
        this.publisher.send(message);
    }
}
