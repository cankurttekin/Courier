package com.cankurttekin.Courier.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "courier_locator")
@Entity
public class CourierLocator {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn
    private Courier courier;

    private double latitude;
    private double longitude;
}
