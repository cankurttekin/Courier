package com.cankurttekin.Courier.application.service;

import com.cankurttekin.Courier.domain.entity.Courier;
import com.cankurttekin.Courier.domain.exception.CourierNotFoundException;
import com.cankurttekin.Courier.domain.repository.CourierRepository;
import com.cankurttekin.Courier.domain.service.CourierService;
import org.springframework.beans.factory.annotation.Autowired;

public class CourierServiceImpl implements CourierService {
    @Autowired
    private CourierRepository courierRepository;

    @Override
    public Courier getCourierById(Long id) {
        return courierRepository.findById(id).orElseThrow(() -> new CourierNotFoundException("Courier not found with id: " + id));
    }

    @Override
    public Courier createCourier(Courier courier) {
        return courierRepository.save(courier);
    }

    @Override
    public void updateCourier() {
        // implement
    }
}
