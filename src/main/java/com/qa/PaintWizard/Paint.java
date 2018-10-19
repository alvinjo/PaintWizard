package com.qa.PaintWizard;

import java.util.Comparator;

public class Paint {
	
	
	double cost;
	int litres;
	int areaPerLitre;
	String name;
	
	
	public Paint(String name, int litres, double cost, int area) {
		this.cost = cost;
		this.litres = litres;
		this.areaPerLitre = area;
		this.name = name;
	}


	@Override
	public String toString() {
		return "[Name: " + name + ", Litres: " + litres + ", Cost: £" + cost + ", Area(m^2): " + areaPerLitre + "]";
	}



	
}
