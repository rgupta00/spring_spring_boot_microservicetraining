package com.dp.creational.e.factory_method;

public class DemoFactoryMethod {

	public static void main(String[] args) {

		BatchProcessor batchProcessor = new CsvBatchProcessor();
		batchProcessor.processBatch("empdata");
	}

}
