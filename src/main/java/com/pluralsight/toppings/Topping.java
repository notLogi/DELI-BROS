package com.pluralsight.toppings;

public abstract class Topping {
    private String name;
    private int size;
    private boolean isExtra;

    public Topping(String name, int size, boolean extra){
        this.name = name;
        this.size = size;
        isExtra = extra;
    }

    public Topping(String name, boolean extra){
        this.name = name;
        isExtra = extra;
    }

    public double getCost(){
        return 0.0;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public boolean isExtra() {
        return isExtra;
    }
}
