package com.github.ajroot5685.example.auto.file;

import com.github.ajroot5685.core.ExcelBuilder;
import com.github.ajroot5685.example.auto.AutoExampleDto;
import com.github.ajroot5685.output.OutputWriter;
import com.github.ajroot5685.output.WriterFactory;
import java.util.List;

public class FileOutputExample {
    // Must end with a .xlsx extension.
    // If not, it sticks automatically.
    private final String outputPath = "C:/Users/s_wjdrms5685/Downloads/excel.xlsx";

    public void fileExample() {
        List<AutoExampleDto> excelDto = List.of(
                new AutoExampleDto("1", "example"),
                new AutoExampleDto("2", "example2")
        );

        // Writer generation is required.
        OutputWriter writer = WriterFactory.forFileOutput(outputPath);
        ExcelBuilder.generateWithAutoMapping(AutoExampleDto.class, excelDto, writer);
    }

    public static void main(String[] args) {
        new FileOutputExample().fileExample();
    }
}
