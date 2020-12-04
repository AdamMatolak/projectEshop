package sk.kosickaakademia.matolak.projecteshop.uncountable;

import sk.kosickaakademia.matolak.projecteshop.Item;

public class Apple extends Item implements WeightItem{

    private double weight;

    public Apple(double price, String name, double weight) {
        super(price, name);
        this.weight=weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public double getItemPrice() {
        return weight*getPrice();
    }
}
