package com.cankurttekin.Courier.presentation.rest;

import com.cankurttekin.Courier.application.mapper.CourierMapper;
import com.cankurttekin.Courier.domain.service.CourierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/couriers")
public class CourierController {

    @Autowired private CourierService courierService;
    @Autowired private CourierMapper courierMapper;

    /*
    // implement
    @GetMapping

    @GetMapping

    @PostMapping
     */
}
