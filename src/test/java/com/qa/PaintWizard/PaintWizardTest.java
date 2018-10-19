package com.qa.PaintWizard;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PaintWizardTest {
	Paint cheapoMax;
	Paint thatOneWithDog;
	Paint averageJoe;
	PaintWizard gandalf;
	
	@Before public void before() {
		cheapoMax = new Paint("CheapoMax",21, 19.99, 10);
		thatOneWithDog = new Paint("ThatOneWithTheDog", 40, 34.38, 12);
		averageJoe = new Paint("AverageJoe", 16, 17.99, 11);
		
	}
	
	
	@Test
	public void testleastWaste() {
		gandalf = new PaintWizard(220, cheapoMax, thatOneWithDog, averageJoe);
		assertEquals("AverageJoe", gandalf.leastWaste());
		
		gandalf = new PaintWizard(180, cheapoMax, thatOneWithDog, averageJoe);
		assertEquals("CheapoMax", gandalf.leastWaste());
		
		gandalf = new PaintWizard(479, cheapoMax, thatOneWithDog, averageJoe);
		assertEquals("ThatOneWithTheDog", gandalf.leastWaste());
		//mod 0
		gandalf = new PaintWizard(480, cheapoMax, thatOneWithDog, averageJoe);
		assertEquals("ThatOneWithTheDog", gandalf.leastWaste());
		
	}
	
	
	
}
