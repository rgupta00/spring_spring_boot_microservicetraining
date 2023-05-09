package com.dp.creational.e.factory_method;

import java.io.File;
import java.util.List;

public class CSVParser implements Parser{

	public CSVParser(File file) {
		System.out.println("creating CSV parser...");
	}

	public List<Record> parse() {
		System.out.println("creating record list using CSV parser...");
		return null;
	}

}