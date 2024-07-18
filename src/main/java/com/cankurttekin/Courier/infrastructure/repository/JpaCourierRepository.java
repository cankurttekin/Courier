package com.cankurttekin.Courier.infrastructure.repository;

import com.cankurttekin.Courier.domain.entity.Courier;
import com.cankurttekin.Courier.domain.repository.CourierRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JpaCourierRepository extends JpaRepository<Courier, Long>, CourierRepository {
    // Optional<Courier> findByTracking ?? implement
}
