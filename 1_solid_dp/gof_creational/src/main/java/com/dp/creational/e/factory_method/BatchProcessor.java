package com.dp.creational.e.factory_method;

import java.io.File;
import java.util.List;

abstract  public class BatchProcessor {
	//txt, csv
	public void processBatch(String fileName) {
		File file = openFile();
		Parser parser =createParser(file);
		List<Record> records = parser.parse();
		processorRecords(records);
		writeSummray();
		closeFile();
	}

	abstract Parser createParser(File file);

	private void processorRecords(List<Record> records) {
		System.out.println("processing each record to db");
	}

	private void writeSummray() {
		System.out.println("writing summery report");
	}

	private void closeFile() {
		System.out.println("closing the file...");
	}

	private File openFile() {
		System.out.println("open the file...");
		return null;
	}
}


//		if(format.equals("txt")){
//			parser=new TextParser(file);
//		}else if(format.equals("csv")){
//			parser=new CSVParser(file);
//		}else if(format.equals("json")){
//			parser=new JsonParser(file);
//		}