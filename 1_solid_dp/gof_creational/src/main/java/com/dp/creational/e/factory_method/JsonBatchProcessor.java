package com.dp.creational.e.factory_method;

import java.io.File;

public class JsonBatchProcessor extends BatchProcessor{
    @Override
    Parser createParser(File file) {
        return new JsonParser(file);
    }
}
