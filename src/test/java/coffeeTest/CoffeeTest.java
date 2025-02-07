package coffeeTest;

import org.example.coffee.Coffee;
import org.example.coffee.CoffeeDust;
import org.example.enums.CoffeConditions;

import org.junit.Test;

public class CoffeeTest {

    @Test
public void BuildItem()throws Exception{
        Coffee coffee = new CoffeeDust("Якобс", 15.0, 10.0, CoffeConditions.COFFEE_DUST);
}



}
