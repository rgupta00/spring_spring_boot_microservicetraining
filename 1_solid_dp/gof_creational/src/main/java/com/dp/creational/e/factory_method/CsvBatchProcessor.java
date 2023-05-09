package com.dp.creational.e.factory_method;

import java.io.File;

public class CsvBatchProcessor extends  BatchProcessor{
    @Override
    Parser createParser(File file) {
        return new CSVParser(file);
    }
}
