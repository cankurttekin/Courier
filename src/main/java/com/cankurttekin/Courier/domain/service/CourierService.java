package com.cankurttekin.Courier.domain.service;

import com.cankurttekin.Courier.domain.entity.Courier;

public interface CourierService {
    Courier getCourierById(Long id);
    Courier createCourier(Courier courier);
    void updateCourier(); // refactor
}
