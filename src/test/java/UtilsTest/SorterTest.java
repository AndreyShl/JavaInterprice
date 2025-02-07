package UtilsTest;


import org.example.coffee.*;
import org.example.deliveryCar.Furgon;
import org.example.enums.CoffeConditions;

import java.util.ArrayList;
import java.util.List;

public class SorterTest {

    public void findCoffeeInFurgon(){
        Furgon furgon = new Furgon("TestFurgon",222.0);
        List<Coffee> mockList = new ArrayList<>();
        Coffee coffee1 = new CoffeeCans("TestCoffee", 15.0, 10.0, CoffeConditions.COFFEE_CANS);
        Coffee coffee2 = new CoffeeDust("TestCoffee2", 16.0, 5.0, CoffeConditions.COFFEE_DUST);
        Coffee coffee3 = new CoffeeGrain("TestCoffee3", 11.0, 20.0, CoffeConditions.COFFEE_GRAIN);
        Coffee coffee4 = new CoffeeInstant("TestCoffee4", 12.0, 25.0, CoffeConditions.COFFEE_INSTANT);
        furgon.downloadCoffee(coffee1);
        furgon.downloadCoffee(coffee2);
        furgon.downloadCoffee(coffee3);
        furgon.downloadCoffee(coffee4);
        mockList.add(coffee1);
        mockList.add(coffee2);
        mockList.add(coffee3);
        mockList.add(coffee4);

    }
}
