package org.example;

public class Toy {
    private int id;
    private String name;
    private int quantity;
    private double weight;
    private double frequency;

    public Toy(int id, String name, int quantity, double weight, double frequency) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
        this.frequency = frequency;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", weight=" + weight +
                ", frequency=" + frequency +
                '}';
    }
}
