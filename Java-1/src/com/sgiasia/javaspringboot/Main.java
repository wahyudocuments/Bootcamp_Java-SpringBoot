package com.sgiasia.javaspringboot;

import com.sgiasia.javaspringboot.model.Admin;
import com.sgiasia.javaspringboot.model.Operator;
import com.sgiasia.javaspringboot.model.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Admin admin1 = new Admin("admin1", "123");
        System.out.println(admin1.getUserName());

        Operator operator1 = new Operator("op1", "234");
        System.out.println(operator1.getUserName());




    }
}