package src.classes;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import src.JsonWriter; 

public class Product {

    transient JsonWriter jsonWriter = new JsonWriter();

    private String name;
    private double price;
    private int amount;

    public Product() {}

    public Product(String name, double price, int amount) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }
    

    public void createProduct(Scanner sc) {
        System.out.println("Qual o nome do produto?");
        name = sc.nextLine();
        System.out.println("Qual o preço do produto?");
        price = sc.nextDouble();
        System.out.println("Há quantas unidades desse produto?");
        amount = sc.nextInt();

        Product newProduct = new Product(name, price, amount);

        List<Product> products = jsonWriter.load();
        products.add(newProduct);

        jsonWriter.save(products);
        sc.nextLine();
    }

    public Double getPrice(){
        return price;
    }


    public int getAmount(){
        return amount;
    }

    
    public String getName(){
        return name;
    }



}
