package org.example.coffee;

import org.example.enums.CoffeConditions;

public abstract class Coffee {
    protected Double price;
    protected String name;
    protected Double size;
    protected CoffeConditions condition;
    protected Double payback;

    public Coffee(String name, Double price, Double size, CoffeConditions condition) {
        this.name = name;
        this.price = price;
        this.condition = condition;
        this.size = size;
        payback = price / size;
    }

    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Double getSize() {
        return size;
    }

    public Double getPayback() {
        return payback;
    }

    public CoffeConditions getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", condition=" + condition +
                '}';
    }
}
