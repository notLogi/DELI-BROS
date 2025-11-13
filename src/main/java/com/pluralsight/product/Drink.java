package com.pluralsight.product;

public class Drink extends Product{
    private int size;

    public Drink(String name, int size){
        super(name);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public double getCost(){
        return switch(size){
            case 1 -> 2.00;
            case 2 -> 2.50;
            case 3 -> 3.00;
            default -> 0.0;
        };
    }

    @Override
    public String toString() {
        String sizeConvert = switch(size){
            case 1 -> "small";
            case 2 -> "medium";
            case 3 -> "large";
            default -> throw new IllegalStateException("Unexpected value: " + size);
        };
        return getName() + "(size: " +
                sizeConvert + "): $" + String.format("%.2f", getCost());
    }
}
