package com.company;

public class Hero {
    private String name = "Goliath";
    private char sex = 'M';
    private int health = 100;
    private int strength = 10;
    public void printInfo() {
        System.out.println(name + " is " + sex + " and has " + health + " health and his strength is " + strength);
    }
    public void setName(String name) {
        this.name = name;
    }
}