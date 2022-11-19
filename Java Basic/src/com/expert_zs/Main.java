package com.expert_zs;

import java.awt.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

    //Initializing variables
        int myAge =27;
        int herAge = myAge-3;
        System.out.println(herAge);

    //Initializing variables with primitive data type
        byte age = 26;
        int number = 426_554_554;
        long viewsCount = 3_426_554_554L;
        float price = 55.4F;
        double depositAmount = 55000.00;
        char letter = 'A';
        boolean isEligeble = true;
        System.out.println(isEligeble);

    //Initializing reference type
        Date now = new Date();
        System.out.println(now);
        Point point1 = new Point(1,2);
        Point point2 = point1;
        point1.x=5;
        System.out.println(point1);
        System.out.println(point2);

    //Initializing String
        String message = "  This is the review of Java Programming!!";
        System.out.println(message);

    //Checking differnts String methods
        System.out.println(message.indexOf("T"));
        System.out.println(message.length());
        System.out.println(message.replace("!","*"));
        System.out.println(message.trim());
        System.out.println(message.concat("  love this challenge"));

    }
}
