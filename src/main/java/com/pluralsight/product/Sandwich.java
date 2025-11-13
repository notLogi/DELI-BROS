package com.pluralsight.product;

import com.pluralsight.toppings.*;

import java.util.ArrayList;

public class Sandwich extends Product{
    private String breadType;
    private int size;
    private ArrayList<Topping> listOfToppings;
    private boolean isToasted;

    public Sandwich(String name, String breadType, int size, boolean isToasted){
        super(name);
        listOfToppings = new ArrayList<>();
        this.breadType = breadType;
        this.size = size;
        this.isToasted = isToasted;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public ArrayList<Topping> getListOfToppings(){
        return listOfToppings;
    }

    public void setListOfToppings(ArrayList<Topping> listOfToppings) {
        this.listOfToppings = listOfToppings;
    }

    public int getSize(){
        return size;
    }

    public void addToppingToList(Topping topping){
        listOfToppings.add(topping);
    }

    @Override
    public double getCost(){
        double totalCost = 0;
        switch(size){
            case 4 -> totalCost += 5.50;
            case 8 -> totalCost += 7.00;
            case 12 -> totalCost += 8.50;
            default -> System.err.println("You did not order a sandwich.");
        }
        totalCost = listOfToppings.stream()
                .map(Topping::getCost)
                .reduce(totalCost, Double::sum);
        return totalCost;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Topping topping : listOfToppings){
            String extraTopping = "";
            if(topping.isExtra()){
                extraTopping = "(extra)";
            }
            sb.append(topping.getName()).append(extraTopping).append(", ");
        }
        sb.deleteCharAt(sb.length() - 2);
        String isToastedConvert = isToasted() ? "(Toasted)" : "";
        return getName() + isToastedConvert + ": $" + String.format("%.2f", getCost()) + "\nBread Type: " + breadType + "\nSize: " + size + "\nToppings: " + sb + "\n";
    }
}
