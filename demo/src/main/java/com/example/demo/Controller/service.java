package com.example.demo.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class service {
    @Autowired
    private Publisher publisher;

    public void sendToRabbit(String message) {
        log.info("Message '{}' enviado ... ", message);
        this.publisher.send(message);
    }
}
