package org.example.Service;

import org.example.coffee.Coffee;
import org.example.deliveryCar.Furgon;

public class DownloadCoffeeService {

    public void downloadCoffee(Furgon furgon, Coffee coffee) {
        if (furgon.getMaxCapacity() - furgon.getCurrentCapacity() >= coffee.getSize()) {
            furgon.getFurgonLoading().add(coffee);
            furgon.setCurrentCapacity(furgon.getCurrentCapacity()+coffee.getSize());
            System.out.println("объект " + coffee + " был загружен в " + furgon.getName());
        }else System.out.println("В фургоне недостаточно место для "+coffee);
    }
}
