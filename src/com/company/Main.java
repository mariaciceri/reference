package com.company;

import animal.Cat;
import animal.Mammal.FurQuantity;

public class Main
{
    public static void main(String[] args)
    {
        Cat garfield = new Cat("Garfield");
        garfield.setUp(FurQuantity.MEDIUM, "orange", 4, "meow", "felis catus");

        System.out.println(garfield.toString());
        garfield.speak();
        garfield.hunt();

    }
}
