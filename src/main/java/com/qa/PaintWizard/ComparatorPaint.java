package com.qa.PaintWizard;

public class ComparatorPaint implements Comparable<ComparatorPaint> {
    String name;
    int totalArea;
    int diff;

    public ComparatorPaint(String name,int totalArea, int diff){
        this.name = name;
        this.totalArea = totalArea;
        this.diff = diff;
    }


    public String getName() {
        return name;
    }


    public int getDiff(){
        return diff;
    }


    @Override
    public String toString() {
        return "ComparatorPaint{" +
                "name='" + name + '\'' +
                ", diff=" + diff +
                '}';
    }


    @Override
    public int compareTo(ComparatorPaint o) {
        if (totalArea == diff){
            return 1;
        }

        if (diff < o.diff){
            return 1;
        } else if (diff == o.diff){
            return 0;
        } else {
            return -1;
        }

    }
}