package com.company.factory;

public class AppFactory {
    public static void main(String[] args) {
        SeaLogistics s = new SeaLogistics();
        Ship ship = new Ship();
        ship.deliver();
    }
}
