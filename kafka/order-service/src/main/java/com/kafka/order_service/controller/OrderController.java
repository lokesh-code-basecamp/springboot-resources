package com.kafka.order_service.controller;

import com.kafka.order_service.model.OrderEvent;
import com.kafka.order_service.service.OrderProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderProducer producer;

    @PostMapping
    public String createOrder(@RequestBody OrderEvent event) {
        event.setStatus("CREATED");
        producer.publishOrder(event);
        return "Order event published";
    }
}

