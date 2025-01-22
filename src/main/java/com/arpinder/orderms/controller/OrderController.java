package com.arpinder.orderms.controller;

import com.arpinder.orderms.dto.OrderDTO;
import com.arpinder.orderms.dto.OrderDTOFromFE;
import com.arpinder.orderms.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;


    @PostMapping("/saveOrder")
    public ResponseEntity<OrderDTO> saveOrder(@RequestBody OrderDTOFromFE orderDetails){
        OrderDTO orderSaveInDB=orderService.saveOrderInDb(orderDetails);
        return new ResponseEntity<>( orderSaveInDB, HttpStatus.CREATED);

    }
}
