package com.dp.creational.e.factory_method;

import java.io.File;

public class TextBatchProcessor extends  BatchProcessor{
    @Override
    Parser createParser(File file) {
        return new TextParser(file);
    }
}
