package com.company;
public class npc {
    private String name = "Niedobry";
    private int health = 50;
    private int strength = 5;
    private int hit = 1;
    private int armor = 1;
    private int money = 25;
    private char frakcja = 'A';
    private float speed = 5.0F;
    private char buffs = 'S';
    private int mana = 0;
    public npc() {
        npcCount++;
    }
    public void applyDamage(int ile) {
        health -= ile;
    }
    public void statystyki() {
        System.out.println("name: " + name + "\n health " + health);
        if (health <=0) {
            System.out.println("Wróg zginął");
        }
        public void getTaunt() {
            int random = 2;
            //zrobic random od 1 do 4, nie znam komendy
            switch (random) {
                case 1:
                    System.out.println("Zginiesz marnie!");
                    break;
                case 2:
                    System.out.println("Już nie żyjesz!");
                    break;
                case 3:
                    System.out.println("Pokonam Cię!");
                    break;
                case 4:
                    System.out.println("Nie masz szans!");
                    break;
            }
            // metoda pozwalająca atakować bohatera
        }
    }
