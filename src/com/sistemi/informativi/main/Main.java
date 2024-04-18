package com.sistemi.informativi.main;

import com.sistemi.informativi.singleton.Product;

public class Main {
    public static void main(String[] args) {

        Product p1 = Product.getProduct();
        Product p2 = Product.getProduct();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}