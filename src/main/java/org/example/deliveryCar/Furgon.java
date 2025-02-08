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

    public void uploadCoffee(Coffee coffee) {
        if (furgonLoading.contains(coffee)) {
            currentCapacity -= coffee.getSize();
            furgonLoading.remove(coffee);
            System.out.println("объект " + coffee + " был выгружен из " + getName());
        }
    else System.out.println("объект " + coffee + " не загружен в фуру, пожалуйста выберите из " +
                "загруженных объектов что хотите выгрузить " + furgonLoading);
    }

    public void downloadCoffee(Coffee coffee) {
        if (maxCapacity - currentCapacity >= coffee.getSize()) {
            furgonLoading.add(coffee);
            currentCapacity += coffee.getSize();
            System.out.println("объект " + coffee + " был загружен в " + getName());
        }else System.out.println("В фургоне недостаточно место для "+coffee);
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
}
