package com.pluralsight.data;

import com.pluralsight.product.Product;

import java.time.LocalDateTime;
import java.io.*;
import java.time.format.DateTimeFormatter;

public class ReceiptManager {
    public void saveReceipt(Cart cart){
        LocalDateTime timeNow = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");
        String fileName = "receipts/" + timeNow.format(formatter) + ".txt";
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
            writer.write("YOUR RECEIPT\n");
            for(Product product : cart.getShoppingCart()){
                writer.write(product.toString() + "\n");
            }
        }
        catch(Exception ex){
            System.err.println("File not able to be saved.");
        }
    }
}
