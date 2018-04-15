package com.company;

import animal.Animal;

public class Main
{
    public static void main(String[] args)
    {
        Animal a = new Animal("cOrAl");

        if (a.isAsexual())
        {
            System.out.println("O animal " + a.name + " é assexuado.");
        }
        else
        {
            System.out.println("O animal " + a.name + " não é assexuado.");
        }
    }
}
