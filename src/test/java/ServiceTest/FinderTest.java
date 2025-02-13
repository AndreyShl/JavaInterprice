package ServiceTest;

import org.example.Service.DownloadCoffeeService;
import org.example.coffee.*;
import org.example.comparators.PriceComparator;
import org.example.deliveryCar.Furgon;
import org.example.enums.CoffeConditions;
import org.example.Service.FinderService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FinderTest {
    private List<Coffee> mockListCoffee=new ArrayList<>();


    @Before
    public void createList(){

        mockListCoffee= genCoffeeList();
    }

    @Test
    public void findCoffeeInFurgon() {
        DownloadCoffeeService testService = new DownloadCoffeeService();
        Predicate<Coffee> coffeePredicate = coffee -> coffee.getPrice() <= 13 && coffee.getPrice() >= 12;
        Furgon furgon = new Furgon("TestFurgon", 222.0);

        List<Coffee> tested = mockListCoffee.stream().filter(coffeePredicate).toList();
        List<Coffee> coffeeList = FinderService.findCoffee(furgon.getFurgonLoading(), coffeePredicate);

        Assert.assertEquals(tested, coffeeList);

    }



    private static List<Coffee> genCoffeeList(){
        List<Coffee> coffeeList = new ArrayList<>();
        coffeeList.add(new CoffeeCans("TestCoffee", 15.0, 10.0, CoffeConditions.COFFEE_CANS));
        coffeeList.add(new CoffeeDust("TestCoffee2", 16.0, 5.0, CoffeConditions.COFFEE_DUST));
        coffeeList.add(new CoffeeGrain("TestCoffee3", 16.0, 20.0, CoffeConditions.COFFEE_GRAIN));
        coffeeList.add(new CoffeeInstant("TestCoffee4", 17.0, 25.0, CoffeConditions.COFFEE_INSTANT));
        return coffeeList;
    }

}
