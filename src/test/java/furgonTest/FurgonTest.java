package furgonTest;

import org.example.coffee.Coffee;
import org.example.coffee.CoffeeCans;
import org.example.deliveryCar.Furgon;
import org.example.enums.CoffeConditions;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FurgonTest {
    @Test
    public void downloadCoffeeInFurgon() {
        Furgon furgon1 = new Furgon("TestFurgon", 22.0);
        Coffee coffee1 = new CoffeeCans("TestCoffee", 12.0, 12.0, CoffeConditions.COFFEE_CANS);
        furgon1.downloadCoffee(coffee1);
        List<Coffee> expectedList = new ArrayList<>();
        expectedList.add(coffee1);

        Assert.assertTrue(expectedList.contains(coffee1) && furgon1.getFurgonLoading().contains(coffee1));
    }

    @Test
    public void downloadCoffeeInFurgonButNotEnouthSize() {

        Furgon furgon1 = new Furgon("TestFurgon", 2.0);
        Coffee coffee1 = new CoffeeCans("TestCoffee", 12.0, 12.0, CoffeConditions.COFFEE_CANS);
        furgon1.downloadCoffee(coffee1);

        Assert.assertTrue(furgon1.getFurgonLoading().isEmpty());
    }

    @Test
    public void uploadCoffeeInFurgon() {
        List<Coffee> testListCoffee=new ArrayList<>();
        Furgon furgon1 = new Furgon("TestFurgon", 22.0);
        Coffee coffee1 = new CoffeeCans("TestCoffee", 12.0, 12.0, CoffeConditions.COFFEE_CANS);
        testListCoffee.add(coffee1);
        furgon1.downloadCoffee(coffee1);
        Assert.assertTrue(furgon1.getFurgonLoading().contains(coffee1)&&testListCoffee.contains(coffee1));
        furgon1.uploadCoffee(coffee1);

        Assert.assertTrue(furgon1.getFurgonLoading().isEmpty());


    }

    @Test
    public void uploadCoffeeInFurgonButCoffeeNonFound() throws RuntimeException {
        Furgon furgon1 = new Furgon("TestFurgon", 22.0);
        Coffee coffee1 = new CoffeeCans("TestCoffee", 12.0, 12.0, CoffeConditions.COFFEE_CANS);
        furgon1.uploadCoffee(coffee1);

        Assert.assertFalse(furgon1.getFurgonLoading().contains(coffee1));

    }


}
