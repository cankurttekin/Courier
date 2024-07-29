package com.cankurttekin.Courier.application.mapper;

import com.cankurttekin.Courier.application.dto.CourierLocatorDTO;
import com.cankurttekin.Courier.domain.entity.CourierLocator;
import org.springframework.stereotype.Component;

@Component
public class CourierLocatorMapper {
    public CourierLocatorDTO toDTO(CourierLocator courierLocator) {
        if (courierLocator == null) {
            return null;
        }

        CourierLocatorDTO courierLocatorDTO = new CourierLocatorDTO();
        // implement
        return courierLocatorDTO;
    }


    public CourierLocator toEntity(CourierLocatorDTO courierLocatorDTO) {
        CourierLocator courierLocator = new CourierLocator();

        // implement

        return courierLocator;









    }

}
