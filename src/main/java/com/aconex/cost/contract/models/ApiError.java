package com.aconex.cost.contract.models;

import java.io.Serializable;

public class ApiError implements Serializable {

    private final String message;

    public ApiError(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
