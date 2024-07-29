package com.cankurttekin.Courier.domain.service;

import com.cankurttekin.Courier.domain.entity.CourierLocator;

import java.util.List;

public interface CourierLocatorService {
    CourierLocator getCourierLocationById(Long id);
    //List<CourierLocator> getCourierLocationsByCourierId(Long courierId);
    //CourierLocator createCourierLocation(CourierLocator courierLocation);
}
