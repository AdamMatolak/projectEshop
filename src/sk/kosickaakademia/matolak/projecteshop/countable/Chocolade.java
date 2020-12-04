package sk.kosickaakademia.matolak.projecteshop.countable;

import sk.kosickaakademia.matolak.projecteshop.Item;

public class Chocolade extends Item implements CountItem {
    private int count;

    public Chocolade(double price, String name, int count) {
        super(price, name);
        this.count = count;
    }

    @Override
    public double getItemPrice() {
        return getPrice() * count;
    }

    @Override
    public int getCount() {
        return count;
    }

}