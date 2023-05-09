package com.dp.creational.c.builder;

public class BuilderDemoNeed {

	public static void main(String[] args) {

		Food food=Food.builder().name("PG").unit(50)
				.vitD(0)
				.vitC(20)
				.build();

		//String name, int unit, int vitC, int vitA, int vitB12, int vitB5, int vitD

		Food food2=new Food("PG",100,10,2,444, 64565, 6000);


		String string=new StringBuilder().append("foo").append("bar").toString();
		//what parameter stand for what?
//		Food food=new Food();
//		food.setName("cold drink");
//		food.setUnit(400);
//		food.setVitB12(0);
//		food.setVitB5(300);
//
//
//		System.out.println(food);
	}
}
