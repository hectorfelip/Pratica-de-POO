package src.classes;

import src.JsonWriter;
import java.util.*;

public class FinalOutPut extends Product {

    public FinalOutPut() {
    }

    public FinalOutPut(String name, double price, int amount) {
        super(name, price, amount);
    }

    public void displayOutPut() {
        Product ProductData = new Product();

        List<Product> produto = jsonWriter.load();

        double nowPrice = 0;
            for( int i = 0; i < produto.size(); i ++){
                nowPrice += produto.get(i).getPrice();
            }

            System.out.printf("Name: %s | Amount: %d | Price: %.2f | Total Price : %.2f\n",produto.getLast().getName(),produto.getLast().getAmount(),produto.getLast().getPrice(),nowPrice);
            

        

        

    }
}
