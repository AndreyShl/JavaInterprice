package org.example;

//Фургон кофе. Загрузить фургон определенного объема грузом на определенную сумму из различных сортов кофе,+
//находящихся в тому же в разных физических состояниях (зерно, молотый, растворимый в банках и пакетиках).+
//Учитывать объем кофе вместе с упаковкой.+
// Провести сортировку товаров на основе соотношения цены и веса.+
//Найти товар в фургоне, соответствующий заданному диапазону параметров качества.+

import org.example.Service.UploadCoffeeService;
import org.example.coffee.CoffeeGrain;
import org.example.coffee.Coffee;
import org.example.coffee.CoffeeDust;
import org.example.deliveryCar.Furgon;
import org.example.Service.SorterService;


import static org.example.enums.CoffeConditions.*;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new CoffeeDust("молотый якобс", 50.0, 7.0, COFFEE_DUST);
        Coffee coffee4 = new CoffeeDust("молотый якобс", 10.0, 7.0, COFFEE_DUST);
        Coffee coffee2 = new CoffeeDust("молотый якобс-2", 15.0, 12.0, COFFEE_DUST);
        Coffee coffee3 = new CoffeeGrain("зерно якобс", 20.0, 25.0, COFFEE_GRAIN);
        UploadCoffeeService uploadCoffeeService =new UploadCoffeeService();

        Furgon furgon = new Furgon("фура1",130.0);
        System.out.println(furgon.getFurgonLoading());

        System.out.println(coffee2.getPayback());
        System.out.println();
        System.out.println(furgon.getFurgonLoading());

        SorterService sorted =new SorterService();
        sorted.sortPayBack(furgon);
        System.out.println(furgon.getFurgonLoading());






    }
}