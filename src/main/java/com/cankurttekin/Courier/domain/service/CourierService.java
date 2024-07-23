package com.cankurttekin.Courier.domain.service;

import com.cankurttekin.Courier.domain.entity.Courier;
import com.cankurttekin.Courier.domain.entity.DeliveryStatus;

public interface CourierService {
    Courier getCourierById(Long id);
    Courier createCourier(Courier courier);
    void updateCourier(Long id, DeliveryStatus status);
}
