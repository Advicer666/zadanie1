package com.company;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        Hero hero2 = new Hero();
        npc monster1 = new npc();
        hero1.setName("Gandalf");
        hero2.setName("Frodo");
        monster1.setName("Troll");
        hero1.printInfo();
        hero2.printInfo();
        monster1.printInfo();
    }
}