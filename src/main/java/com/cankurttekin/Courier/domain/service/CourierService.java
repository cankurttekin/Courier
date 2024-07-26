package com.cankurttekin.Courier.domain.service;

import com.cankurttekin.Courier.application.dto.CourierDTO;
import com.cankurttekin.Courier.domain.entity.Courier;
import com.cankurttekin.Courier.domain.entity.DeliveryStatus;

import java.util.List;

public interface CourierService {
    List<CourierDTO> getAllCouriers();
    Courier getCourierById(Long id);
    Courier createCourier(Courier courier);
    void updateCourier(Long id, DeliveryStatus status);
}
