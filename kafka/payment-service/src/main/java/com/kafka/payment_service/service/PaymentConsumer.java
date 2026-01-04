package com.kafka.payment_service.service;

import com.kafka.payment_service.model.OrderEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PaymentConsumer {

    @KafkaListener(topics = "order-events", groupId = "payment-group")
    public void consume(OrderEvent event) {
        System.out.println(event);
    }

}

