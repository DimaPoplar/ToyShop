package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class ToyManager {
    private int totalToys = 0;
    private HashMap<Integer, Toy> toys = new HashMap<>();
    private ArrayList<Integer> prizeToys = new ArrayList<>();

    public void addToy(String name, int quantity, double weight, double frequency) {
        totalToys += quantity;
        int id = toys.size() + 1;
        toys.put(id, new Toy(id, name, quantity, weight, frequency));
        System.out.println("Toy added successfully!");
    }

    public void updateWeight(int id, double weight) {
        if (toys.containsKey(id)) {
            toys.get(id).setWeight(weight);
            System.out.println("Вес успешно обновлен!");
        } else {
            System.out.println("Игрушка не найдена");
        }
    }

    public void printToys() {
        for (Toy toy : toys.values()) {
            System.out.println(toy);
        }
    }

    public void selectPrizeToy(int id) {
        if (toys.containsKey(id)) {
            prizeToys.add(id);
            System.out.println("Призовая игрушка успешно добавлена!");
        } else {
            System.out.println("Игрушка не найдена");
        }
    }

    public void givePrizeToy() {
        if (!prizeToys.isEmpty()) {
            int id = prizeToys.remove(0);
            Toy toy = toys.get(id);
            toy.setQuantity(toy.getQuantity() - 1);
            totalToys--;
            System.out.println("Вручена призовая игрушка: " + toy.getName());
            try {
                FileWriter writer = new FileWriter("prize_toys.txt", true);
                writer.write(toy.getName() + "\n");
                writer.close();
            } catch (IOException e) {
                System.out.println("Ошибка записи в файл.");
            }
        } else {
            System.out.println("Призовых игрушек в наличии нет.");
        }
    }
}
