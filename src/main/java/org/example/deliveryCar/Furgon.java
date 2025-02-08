package org.example.deliveryCar;

import org.example.coffee.Coffee;

import java.util.ArrayList;
import java.util.List;

public class Furgon {
    protected String name;
    protected Double maxCapacity;
    protected Double currentCapacity = 0.0;
    protected List<Coffee> furgonLoading;

    public Furgon(String name, Double maxCapacity) {
        this.name = name;
        this.maxCapacity = maxCapacity;
        furgonLoading = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Double getMaxCapacity() {
        return maxCapacity;
    }

    public Double getCurrentCapacity() {
        return currentCapacity;
    }

    public List<Coffee> getFurgonLoading() {
        return furgonLoading;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setMaxCapacity(Double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void setCurrentCapacity(Double currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public void setFurgonLoading(List<Coffee> furgonLoading) {
        this.furgonLoading = furgonLoading;
    }
}
