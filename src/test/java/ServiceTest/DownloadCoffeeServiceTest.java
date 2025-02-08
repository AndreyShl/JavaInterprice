package ServiceTest;

import org.example.Service.DownloadCoffeeService;
import org.example.coffee.Coffee;
import org.example.coffee.CoffeeCans;
import org.example.deliveryCar.Furgon;
import org.example.enums.CoffeConditions;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DownloadCoffeeServiceTest {
    @Test
    public void downloadCoffeeInFurgon() {
        DownloadCoffeeService testService =new DownloadCoffeeService();
        Furgon furgon1 = new Furgon("TestFurgon", 22.0);
        Coffee coffee1 = new CoffeeCans("TestCoffee", 12.0, 12.0, CoffeConditions.COFFEE_CANS);
        testService.downloadCoffee(furgon1,coffee1);
        List<Coffee> expectedList = new ArrayList<>();
        expectedList.add(coffee1);

        Assert.assertTrue(expectedList.contains(coffee1) && furgon1.getFurgonLoading().contains(coffee1));
    }

    @Test
    public void downloadCoffeeInFurgonButNotEnouthSize() {
        DownloadCoffeeService testService =new DownloadCoffeeService();
        Furgon furgon1 = new Furgon("TestFurgon", 2.0);
        Coffee coffee1 = new CoffeeCans("TestCoffee", 12.0, 12.0, CoffeConditions.COFFEE_CANS);
        testService.downloadCoffee(furgon1,coffee1);

        Assert.assertTrue(furgon1.getFurgonLoading().isEmpty());
    }
}
