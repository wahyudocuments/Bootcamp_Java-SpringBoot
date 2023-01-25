package com.sgiasia.javaspringboot.model;

public class User {
    private String userName;
    private String password;
    private String userLevel;

    private int age;

    /** Constructor */
//    public User (String name) { //Constructor
//        this.userName = name;
//    }
//    public User (String name, int age){
//        this.userName = name;
//        this.age = age;
//    }

    /**Getter dan Setter */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /** Method */
    public void cetakNama(){
        System.out.println(userName);
    }
    public void cetakUmur(){
        System.out.println((age));
    }

}
