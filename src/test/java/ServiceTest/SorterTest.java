package ServiceTest;


import org.example.Service.DownloadCoffeeService;
import org.example.Service.SorterService;
import org.example.coffee.*;
import org.example.comparators.PriceComparator;
import org.example.deliveryCar.Furgon;
import org.example.enums.CoffeConditions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SorterTest {
    private List<Coffee> mockListCoffee=new ArrayList<>();

    @Before
    public void createList(){

        mockListCoffee= genCoffeeList();
    }

    @Test
    public void sortCoffeePriceSorterAndCompareResults() {
        SorterService priceSortTest = new SorterService();
        Furgon furgon = new Furgon("TestFurgon", 222.0);

        List<Coffee> tested = mockListCoffee.stream().sorted(new PriceComparator()).toList();
        furgon.setFurgonLoading(mockListCoffee);
        priceSortTest.sortPrice(furgon);

        List<Coffee> coffeeList = furgon.getFurgonLoading();



        Assert.assertEquals(tested.getFirst(), coffeeList.getFirst());
        Assert.assertEquals(tested.getLast(), coffeeList.getLast());
        Assert.assertEquals(tested.get(2), coffeeList.get(2));
        Assert.assertEquals(tested.get(3), coffeeList.get(3));


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
