package com.cankurttekin.Courier.application.mapper;

import com.cankurttekin.Courier.application.dto.CourierDTO;
import com.cankurttekin.Courier.domain.entity.Courier;

public interface CourierMapper {
    CourierDTO toDTO(Courier courier);
    Courier toEntity(CourierDTO courierDTO);
}
