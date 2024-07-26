package com.cankurttekin.Courier.application.mapper;

import com.cankurttekin.Courier.application.dto.CourierDTO;
import com.cankurttekin.Courier.domain.entity.Courier;
import org.springframework.stereotype.Component;

@Component
public class CourierMapperImpl implements CourierMapper {
    @Override
    public CourierDTO toDTO(Courier courier) {
        if (courier == null) {
            return null;
        }

        CourierDTO courierDTO = new CourierDTO();
        courierDTO.setId((courier.getId()));
        courierDTO.setName(courier.getName());
        courierDTO.setLastname(courier.getLastname());
        courierDTO.setStatus(courier.getStatus());

        return  courierDTO;
    }

    public Courier toEntity(CourierDTO courierDTO) {
        Courier courier = new Courier();

        courier.setId(courierDTO.getId());
        courier.setName(courierDTO.getName());
        courier.setLastname(courierDTO.getLastname());
        courier.setStatus(courierDTO.getStatus());

        return courier;
    }

}
