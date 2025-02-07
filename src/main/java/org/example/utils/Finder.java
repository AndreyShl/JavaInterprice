package org.example.utils;

import org.example.coffee.Coffee;
import org.example.deliveryCar.Furgon;
import org.example.enums.CoffeConditions;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Finder {
    public Finder() {

    }



    public static List<Coffee> findCoffee(List<Coffee> coffeeList, Predicate<Coffee> coffeePredicate){
        return coffeeList.stream().filter(coffeePredicate).collect(Collectors.toList());
    }
}
