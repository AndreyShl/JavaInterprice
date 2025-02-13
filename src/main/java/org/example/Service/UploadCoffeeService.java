package org.example.Service;

import org.example.coffee.Coffee;
import org.example.deliveryCar.Furgon;

public class UploadCoffeeService {
    public void uploadCoffee(Furgon furgon, Coffee coffee) {

        if (furgon.getFurgonLoading().contains(coffee)) {
            furgon.setCurrentCapacity(furgon.getCurrentCapacity()-coffee.getSize());
            furgon.getFurgonLoading().remove(coffee);
            System.out.println("объект " + coffee + " был выгружен из " + furgon.getName());
        }
        else System.out.println("объект " + coffee + " не загружен в фуру, пожалуйста выберите из " +
                "загруженных объектов что хотите выгрузить " + furgon.getFurgonLoading());
    }
}
