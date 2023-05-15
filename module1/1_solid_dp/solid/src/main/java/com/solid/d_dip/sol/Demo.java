package com.solid.d_dip.sol;

public class Demo {

	public static void main(String[] args) {
		Tyre tyre=new MrfTyre();
		Engine engine=new TurboEngine();

		Car car =new Car(engine, tyre);
		car.drive();
	}
}
