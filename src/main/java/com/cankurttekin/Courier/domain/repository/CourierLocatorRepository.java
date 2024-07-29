package com.cankurttekin.Courier.domain.repository;

import com.cankurttekin.Courier.domain.entity.CourierLocator;

import java.util.List;
import java.util.Optional;

public interface CourierLocatorRepository {
    //Optional<CourierLocator> findById(Long id);   // implement this
    //List<CourierLocator> findByCourierIdOrderByCreationDatetimeAsc(Long id);  // implement this too
    List<CourierLocator> findByCourierId(Long id);
    CourierLocator save(CourierLocator courierLocator);
}
