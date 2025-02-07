package UtilsTest;

import org.example.coffee.*;
import org.example.comparators.PriceComparator;
import org.example.deliveryCar.Furgon;
import org.example.enums.CoffeConditions;
import org.example.utils.Finder;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FinderTest {




    @Test
    public void findCoffeeInFurgon(){
        Predicate<Coffee> coffeePredicate = coffee -> coffee.getPrice()<=13 &&coffee.getPrice()>=12;
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

        List<Coffee> resMockList = mockList.stream().filter(coffeePredicate).toList();
        List<Coffee> resCoffeeList = Finder.findCoffee(furgon.getFurgonLoading(),coffeePredicate);

        Assert.assertEquals(resCoffeeList,resMockList);

    }
    @Test
    public void sortCoffeePriceSorterAndCompareResults(){
        Furgon furgon = new Furgon("TestFurgon",222.0);
        List<Coffee> mockList = new ArrayList<>();
        Coffee coffee1 = new CoffeeCans("TestCoffee", 15.0, 10.0, CoffeConditions.COFFEE_CANS);
        Coffee coffee2 = new CoffeeDust("TestCoffee2", 16.0, 5.0, CoffeConditions.COFFEE_DUST);
        Coffee coffee3 = new CoffeeGrain("TestCoffee3", 16.0, 20.0, CoffeConditions.COFFEE_GRAIN);
        Coffee coffee4 = new CoffeeInstant("TestCoffee4", 17.0, 25.0, CoffeConditions.COFFEE_INSTANT);
        furgon.downloadCoffee(coffee1);
        furgon.downloadCoffee(coffee2);
        furgon.downloadCoffee(coffee3);
        furgon.downloadCoffee(coffee4);
        mockList.add(coffee1);
        mockList.add(coffee2);
        mockList.add(coffee3);
        mockList.add(coffee4);


        List<Coffee> resMockList =   mockList.stream().sorted(new PriceComparator()).toList();
        List<Coffee> resCoffeeList = furgon.getFurgonLoading().stream().sorted(new PriceComparator()).toList();


        Assert.assertEquals(resMockList.getFirst(),resCoffeeList.getFirst());
        Assert.assertEquals(resMockList.getLast(),resCoffeeList.getLast());
        Assert.assertEquals(resMockList.get(2),resCoffeeList.get(2));
        Assert.assertEquals(resMockList.get(3),resCoffeeList.get(3));



    }





}
