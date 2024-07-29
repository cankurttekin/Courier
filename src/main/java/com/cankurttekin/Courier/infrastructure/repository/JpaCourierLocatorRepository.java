package com.cankurttekin.Courier.infrastructure.repository;

import com.cankurttekin.Courier.domain.entity.CourierLocator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaCourierLocatorRepository extends JpaRepository<CourierLocator, Long> {
}
