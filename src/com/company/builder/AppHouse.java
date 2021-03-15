package com.company.builder;
public class AppHouse {
    public static void main(String[] args) {
        House h = new House.Builder()
                .buildWindows(8)
                .buildDoors(2)
                .buildRooms(5)
                .buildGarage(false)
                .buildSwimpool(true)
                .buildStatue(false)
                .buildGarden(false)
                .getResult();
    }
}
