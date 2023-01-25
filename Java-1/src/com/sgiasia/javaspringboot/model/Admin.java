package com.sgiasia.javaspringboot.model;

public class Admin extends User {

    private String permission;

    public Admin(String userName, String password){
        super(userName, password, "ADMIN");
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
