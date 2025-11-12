package com.pluralsight.data;

import com.pluralsight.product.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart {
    private ArrayList<Product> shoppingCart;

    public Cart(){
        shoppingCart = new ArrayList<>();
    }

    public ArrayList<Product> getShoppingCart() {
        return shoppingCart;
    }

    public void addProduct(Product product){
        shoppingCart.add(product);
    }

    public void emptyShoppingCart(){
        shoppingCart.clear();
    }

    public void removeProduct(Scanner scanner){
        if(shoppingCart.isEmpty()){
            System.out.println("You have no items in your cart.");
            return;
        }
        //when it prints, it will display 0, so I have to add 1.
        System.out.println("What item would you like to remove? Type in the number\nType 99 to return to menu.");
        for(int i = 0; i < shoppingCart.size(); i++){
            System.out.println((i + 1) + ") " + shoppingCart.get(i).toString());
        }
        while(true){
            try{
                int choice = scanner.nextInt();
                scanner.nextLine();
                if(choice == 99) return;
                if(choice >= 1 && choice <= shoppingCart.size()) {//If user enters anything less than 1 or more than the number of products, it will loop again.
                    shoppingCart.remove(choice - 1);
                    return;
                }
                else{
                    System.out.println("The item you want to remove is not listed.");
                }
            } catch (Exception e) {
                System.err.println("Please enter a number, no letters please.");
                scanner.nextLine();
            }
        }
    }

    public double getTotalCost(){
        return shoppingCart.stream()
                .map(Product::getCost)
                .reduce(0.0, Double::sum);
    }

}
