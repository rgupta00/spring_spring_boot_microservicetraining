package com.solid.d_dip.sol;
//SOLID		D: DIP
//Who will manage the dependency?
//IOC(inversion of controller)-> one type of IOC is 	DI(Spring)
public class Car {
	private Engine engine;
	private Tyre tyre;

	public Car(Engine engine, Tyre tyre) {
		this.engine=engine;
		this.tyre=tyre;
	}
	public void drive() {
		engine.move();
		tyre.rotate();
	}
}
