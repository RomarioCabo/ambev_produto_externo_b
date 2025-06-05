package com.br.produto_externo_b.controller.impl;

import com.br.produto_externo_b.controller.OrderController;
import com.br.produto_externo_b.domain.order.OrderRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class OrderControllerImpl implements OrderController {

    @Override
    public ResponseEntity<Void> receiveOrder(OrderRequest request) {
        log.info("Receive order request: {}", request);
        return ResponseEntity.ok().build();
    }
}
