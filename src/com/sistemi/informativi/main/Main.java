package com.sistemi.informativi.main;

import com.sistemi.informativi.builder.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {


        User user1 = new User.UserBuilder("username1","password1").build();

        System.out.println(user1.toString());

        User user2 = new User.UserBuilder("username2","password2").setIsNew(true).build();
        System.out.println(user2.toString());

        User user3 = new User.UserBuilder("username3","password3").
                setIsNew(true).
                setDate(new Date(System.currentTimeMillis())).build();
        System.out.println(user3.toString());

        User user4 = new User.UserBuilder("username4","password4").
                setDate(new Date(System.currentTimeMillis())).build();
        System.out.println(user4.toString());





    }
}