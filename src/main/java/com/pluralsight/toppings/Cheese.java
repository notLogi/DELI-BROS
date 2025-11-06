package com.pluralsight.toppings;

public class Cheese extends Topping{
    public Cheese(String name, int size, boolean extra) {
        super(name, size, extra);
    }

    @Override
    public double getCost(){
        double totalCost = 0;
        double extra = switch (getSize()) {
            case 4 -> {
                totalCost += 0.75;
                yield 0.30;
            }
            case 8 -> {
                totalCost += 1.50;
                yield 0.60;
            }
            case 12 -> {
                totalCost += 2.25;
                yield 0.90;
            }
            default -> 0;
        };
        return isExtra() ? totalCost + extra : totalCost;
    }
}
