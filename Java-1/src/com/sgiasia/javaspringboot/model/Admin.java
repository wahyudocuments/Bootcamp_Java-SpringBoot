package com.sgiasia.javaspringboot.model;

public class Admin extends User {

    private String permission;

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
