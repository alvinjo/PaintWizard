package com.qa.PaintWizard;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class PaintWizard {

    int roomSize;
    ArrayList<Paint> paintList = new ArrayList<>();

    public PaintWizard(int roomSize, Paint... paints){

        for (Paint p : paints) {
            paintList.add(p);
        }
        this.roomSize = roomSize;
    }

    public void setRoomSize(int size){
        this.roomSize = size;
    }


    //change return type to Paint and return the least waste paint object
    public String leastWaste(){
    	
//    	String resultName;
//    	try {
//        	resultName = paintList.stream().filter(p -> roomSize%(p.areaPerLitre*p.litres) == 0).toString();
//    	}catch(NoSuchElementException e) {
//    		resultName = paintList.stream()
//                    .map(p -> new ComparatorPaint(p.name, p.areaPerLitre*p.litres, (p.areaPerLitre*p.litres) - roomSize%(p.areaPerLitre*p.litres)))
//                    .min(Comparator.comparing(ComparatorPaint::getDiff)).get().getName();
//    	}
    

    	String resultName = paintList.stream()
    			.map(p -> new ComparatorPaint(p.name, p.areaPerLitre*p.litres, (p.areaPerLitre*p.litres) - roomSize%(p.areaPerLitre*p.litres)))
    			.min(Comparator.comparing(ComparatorPaint::getDiff)).get().getName();
        
        
/*    	Paint perfectPaint;
        String resultName = paintList.stream()
                .filter(p -> {
                	if (roomSize % (p.areaPerLitre*p.litres) == 0) {
                		perfectPaint = p;
                	}
                	return true;
      
                }
                		
                		
                		)
                .map(p -> new ComparatorPaint(p.name, p.areaPerLitre*p.litres, (p.areaPerLitre*p.litres) - roomSize%(p.areaPerLitre*p.litres)))
                .min(Comparator.comparing(ComparatorPaint::getDiff))
                .get().getName();*/

    	
        Paint leastWaste = findPaintFromName(resultName);
        return leastWaste.name;
//        System.out.println("Least wasted paint: " + leastWaste.name);
    }

    public Paint findPaintFromName(String name){
        return paintList.stream().filter(p -> p.name.equals(name)).findAny().get();
    }





}