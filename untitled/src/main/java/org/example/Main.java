package org.example;

public class Main {
    public static void main(String[] args) {
        ToyManager toyManager = new ToyManager();
        toyManager.addToy("Car", 10, 3, 20);
        toyManager.addToy("Ball", 20, 1, 80);
        toyManager.printToys();
        toyManager.selectPrizeToy(1);
        toyManager.givePrizeToy();
        toyManager.printToys();
        toyManager.updateWeight(1, 20);
        toyManager.printToys();
    }
}

