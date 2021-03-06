package sk.kosickaakademia.matolak.projecteshop.uncountable;

import sk.kosickaakademia.matolak.projecteshop.Item;

public class Peanut extends Item implements WeightItem{
    private double weight;

    public Peanut(double price, String name, double weight) {
        super(price, name);
        this.weight=weight;
    }

    @Override
    public double getItemPrice() {
        return getPrice()*weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}

