package com.dp.creational.e.factory_method;

import java.io.File;
import java.util.List;

public class JsonParser implements Parser{

	public JsonParser(File file) {
		System.out.println("creating json parser...");
	}

	public List<Record> parse() {
		System.out.println("creating record list using json parser...");
		return null;
	}

}