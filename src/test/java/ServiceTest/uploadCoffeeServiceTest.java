package ServiceTest;

import org.example.Service.DownloadCoffeeService;
import org.example.Service.UploadCoffeeService;
import org.example.coffee.Coffee;
import org.example.coffee.CoffeeCans;
import org.example.deliveryCar.Furgon;
import org.example.enums.CoffeConditions;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class uploadCoffeeServiceTest {
    @Test
    public void uploadCoffeeInFurgon() {
        DownloadCoffeeService downloaderTestService = new DownloadCoffeeService();
        UploadCoffeeService uploaderTestService = new UploadCoffeeService();
        List<Coffee> testListCoffee=new ArrayList<>();
        Furgon furgon1 = new Furgon("TestFurgon", 22.0);
        Coffee coffee1 = new CoffeeCans("TestCoffee", 12.0, 12.0, CoffeConditions.COFFEE_CANS);
        testListCoffee.add(coffee1);
        downloaderTestService.downloadCoffee(furgon1,coffee1);

        Assert.assertTrue(furgon1.getFurgonLoading().contains(coffee1)&&testListCoffee.contains(coffee1));
        uploaderTestService.uploadCoffee(furgon1,coffee1);


        Assert.assertTrue(furgon1.getFurgonLoading().isEmpty());


    }

    @Test
    public void uploadCoffeeInFurgonButCoffeeNonFound() throws RuntimeException {
        UploadCoffeeService uploaderTestService = new UploadCoffeeService();
        Furgon furgon1 = new Furgon("TestFurgon", 22.0);
        Coffee coffee1 = new CoffeeCans("TestCoffee", 12.0, 12.0, CoffeConditions.COFFEE_CANS);
        uploaderTestService.uploadCoffee(furgon1,coffee1);

        Assert.assertFalse(furgon1.getFurgonLoading().contains(coffee1));

    }
}
