package com.sub.nit.order.client;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import com.sub.nit.order.entity.Product;

@Component
public class ProductClient {

    private WebClient webClient;

    public ProductClient() {

        webClient = WebClient.builder()
                .baseUrl("http://localhost:8081/products")
                .build();
    }

    public Product getProduct(int id) {

        return webClient.get()
                .uri("/{id}", id)
                .retrieve()
                .bodyToMono(Product.class)
                .block();
    }
}
