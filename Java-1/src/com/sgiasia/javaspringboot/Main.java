package com.sgiasia.javaspringboot;

import com.sgiasia.javaspringboot.model.Admin;
import com.sgiasia.javaspringboot.model.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        User operator1 = new User("Budi", 23);
//        operator1.cetakNama();
//        operator1.cetakUmur();
//
//        User operator2 = new User("Badu");
//        operator2.cetakNama();
//
//        operator1.setUserName("Wahyu");
//        operator1.getUserName();

        /** use Scanner */
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String username = myObj.nextLine();
        System.out.println("Username is " + username);

        /** Inheritance */

        Admin admin1 = new Admin();
        admin1.setPermission("Oke");
        admin1.getPermission();



    }
}