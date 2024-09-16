package com.market.citymarket.api.enums;

public enum StatusEnum {
    CREATED("CREATED");

    private String value;

    StatusEnum(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
