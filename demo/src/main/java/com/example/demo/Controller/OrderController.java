package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final WebClient webClient;

    public OrderController(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://user-service:8081").build();
    }

    @GetMapping
    public List<?> getOrders() {
        return webClient.get()
                .uri("/users")
                .retrieve()
                .bodyToMono(List.class)
                .block();
    }
}
