package com.sistemi.informativi.singleton;

public final class Product {

    private String name;

    private double price;


    private static Product product;


    public  static Product getProduct(){

        if (product==null){

            product = new Product("productX",23.89);

        }

        return product;

    }

    private Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
