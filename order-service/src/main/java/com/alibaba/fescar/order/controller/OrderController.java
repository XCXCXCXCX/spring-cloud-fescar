package com.alibaba.fescar.order.controller;

import com.alibaba.fescar.order.dto.OrderDTO;
import com.alibaba.fescar.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XCXCXCXCX
 * @since 1.0
 */
@RestController("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PutMapping
    public ResponseEntity<?> insert(@RequestBody OrderDTO orderDTO){
        orderService.createOrder(orderDTO);
        return ResponseEntity.ok(HttpEntity.EMPTY);
    }

}
