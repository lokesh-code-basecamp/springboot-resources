package com.kafka.order_service.service;

import com.kafka.order_service.model.OrderEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderProducer {

    private final KafkaTemplate<String, OrderEvent> kafkaTemplate;

    public void publishOrder(OrderEvent event) {
        kafkaTemplate.send(
                "order-events",
                event.getOrderId().toString(),
                event
        );
    }
}

