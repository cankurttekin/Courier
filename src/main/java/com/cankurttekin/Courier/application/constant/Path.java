package com.cankurttekin.Courier.application.constant;

public class Path {
    private Path() {
        throw new IllegalStateException("Path can not be initialized");
    }

    public static final String VERSION = "v1";
    public static final String BASE_PATH = "/api/" + VERSION;
    public static final String BASE_PATH_COURIER = BASE_PATH + "/couriers";
    public static final String BASE_PATH_COURIER_LOCATOR = BASE_PATH + "/courier-locator";
}
