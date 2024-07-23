package com.cankurttekin.Courier.application.dto;

import com.cankurttekin.Courier.domain.entity.DeliveryStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourierDTO {
    private Long id;

    private String name;
    private String lastname;
    private String phoneNumber;
    private DeliveryStatus status;
    //
}
