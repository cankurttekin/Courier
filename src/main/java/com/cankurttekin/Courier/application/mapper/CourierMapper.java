package com.cankurttekin.Courier.application.mapper;

import com.cankurttekin.Courier.application.dto.CourierDTO;
import com.cankurttekin.Courier.domain.entity.Courier;

public class CourierMapper {
    public CourierDTO toDTO(Courier courier) {
        CourierDTO courierDTO = new CourierDTO();
        // implement
        return courierDTO;
    }

    public Courier toEntity(CourierDTO courierDTO) {
        Courier courier = new Courier();
        // implement mapping
        return courier;
    }

}
