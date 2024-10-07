package com.example.demo.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class receptor {

    @RabbitListener(queues = "#{@queue.name}")
    public void receive(@Payload String message) {
        try {
            log.info("Mensaje recibido {}", message);
            makeSlow();
        }
        catch (Exception e) {
            log.error("Error al procesar el mensaje: ", e);
        }

    }

    private void makeSlow() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();;
        }
    }
}
