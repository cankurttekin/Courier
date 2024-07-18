package com.cankurttekin.Courier.domain.exception;

public class CourierNotFoundException  extends RuntimeException {
    public CourierNotFoundException(String err) {
        super(err);
    }
}
