package com.sistemi.informativi.main;

import com.sistemi.informativi.strategy.CinemaProtocol;
import com.sistemi.informativi.strategy.Context;
import com.sistemi.informativi.strategy.Strategy;

public class Main {
    public static void main(String[] args) {



        Context context = new Context(new CinemaProtocol());
        System.out.println(context.executeStrategy());


    }
}