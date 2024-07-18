package com.cankurttekin.Courier.domain.repository;

import com.cankurttekin.Courier.domain.entity.Courier;

import java.util.Optional;

public interface CourierRepository {
    Optional<Courier> findById(Long id);
    Optional<Courier> findByTrackingNumber(String trackingNumber);
    Courier save(Courier courier);
}
