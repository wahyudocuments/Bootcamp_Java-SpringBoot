package com.sgiasia.javaspringboot;

import com.sgiasia.javaspringboot.model.Admin;
import com.sgiasia.javaspringboot.model.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] users = {"Ani", "Badu", "Budi"};
        int userCount = users.length;
        ArrayList<String> cars = new ArrayList<String>();
        /** Add */
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        /** Acces item  (get) */
        cars.get(0);
        System.out.println("Acces : "  + cars.get(0));

        /** Change item (set) */
        cars.set(0, "Opel");
        System.out.println("Change : " + cars.set(0,"Toyota"));
        System.out.println(cars);

        /** Remove item (remove) */
        cars.remove(0);
        cars.clear();

        /** Size (size) */
        cars.size();

        /** Loop Through  (for) */
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        // for each
        for (String i : cars) {
            System.out.println(i);
        }








    }
}