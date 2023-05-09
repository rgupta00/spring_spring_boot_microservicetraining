package com.dp.structural.c.proxy;
//Cross cutting concern

public class Magician {
	private Audiance audiance=new Audiance();

	public void doMagic() {
		System.out.println("abara ka dabra...");
		audiance.clapping();
	}
}
