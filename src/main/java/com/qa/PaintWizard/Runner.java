package com.qa.PaintWizard;

public class Runner {

	
	public static void main(String[] args) {
		
		Paint cheapoMax = new Paint("CheapoMax",21, 19.99, 10);
		Paint thatOneWithDog = new Paint("ThatOneWithTheDog", 40, 34.38, 12);
		Paint AverageJoe = new Paint("AverageJoes", 16, 17.99, 11);
		
		
		PaintWizard dumbledore = new PaintWizard(200, cheapoMax, thatOneWithDog, AverageJoe);
		
		int size = 479;
		System.out.println(size%210);
		System.out.println(size%480);
		System.out.println(size%176);
		
		System.out.println(dumbledore.leastWaste());
		
		
	}
	
	
	
	
}
