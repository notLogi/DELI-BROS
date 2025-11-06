package com.pluralsight.toppings;

public class Meat extends Topping{
    public Meat(String name, int size, boolean extra) {
        super(name, size, extra);
    }

    @Override
    public double getCost(){
        double totalCost = 0;
        //intellij made this suggestion to yielding.
        double extra = switch (getSize()) {
            case 4 -> {
                totalCost += 1.00;
                yield 0.50;
            }
            case 8 -> {
                totalCost += 2.00;
                yield 1.00;
            }
            case 12 -> {
                totalCost += 3.00;
                yield 1.50;
            }
            default -> 0;
        };
        return isExtra() ? totalCost + extra : totalCost;
    }
}
