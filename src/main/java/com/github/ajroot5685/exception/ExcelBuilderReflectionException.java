package com.github.ajroot5685.exception;

public class ExcelBuilderReflectionException extends RuntimeException {
    public ExcelBuilderReflectionException(String fieldName, Throwable cause) {
        super("Failed to access field: " + fieldName, cause);
    }
}
