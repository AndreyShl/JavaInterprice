package org.example.Service;

import org.example.coffee.Coffee;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FinderService {

    public static List<Coffee> findCoffee(List<Coffee> coffeeList, Predicate<Coffee> coffeePredicate){
        return coffeeList.stream().filter(coffeePredicate).collect(Collectors.toList());
    }
}
