package com.company.builder;

public class House {
    private final int windows;
    private final int doors;
    private final int rooms;
    private final boolean hasGarage;
    private final boolean hasSwimPool;
    private final boolean hasStatues;
    private final boolean hasGarden;
    public static class Builder {
        private int windows;
        private int doors;
        private int rooms;
        private boolean hasGarage;
        private boolean hasSwimPool;
        private boolean hasStatues;
        private boolean hasGarden;
        public Builder buildWindows(int number){this.windows = number; return this; }
        public Builder buildDoors(int number){this.doors = number; return this; }
        public Builder buildRooms(int number){this.rooms = number; return this; }
        public Builder buildGarage(boolean number){this.hasGarage = number; return this; }
        public Builder buildSwimpool(boolean number){this.hasSwimPool = number; return this; }
        public Builder buildStatue(boolean number){this.hasStatues = number; return this; }
        public Builder buildGarden(boolean number){this.hasGarden = number; return this; }
        public House getResult() {
            return new House(this);
        }
    }

    private House(Builder builder) {
        this.windows = builder.windows;
        this.doors = builder.doors;
        this.rooms = builder.rooms;
        this.hasGarage = builder.hasGarage;
        this.hasSwimPool = builder.hasSwimPool;
        this.hasStatues = builder.hasStatues;
        this.hasGarden = builder.hasGarden;
    }

}
