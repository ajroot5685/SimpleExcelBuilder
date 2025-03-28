package com.github.ajroot5685.example.auto;

import com.github.ajroot5685.dto.ExcelColumn;

public class AutoExampleDto {
    @ExcelColumn(header = "No")
    private final String no;

    @ExcelColumn(header = "name")
    private final String name;

    public AutoExampleDto(String no, String name) {
        this.no = no;
        this.name = name;
    }
}
