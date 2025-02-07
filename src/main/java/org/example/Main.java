package org.example;

//Фургон кофе. Загрузить фургон определенного объема грузом на определенную сумму из различных сортов кофе,+
//находящихся в тому же в разных физических состояниях (зерно, молотый, растворимый в банках и пакетиках).+
//Учитывать объем кофе вместе с упаковкой.+
// Провести сортировку товаров на основе соотношения цены и веса.+
//Найти товар в фургоне, соответствующий заданному диапазону параметров качества.+

import org.example.coffee.CoffeeGrain;
import org.example.coffee.Coffee;
import org.example.coffee.CoffeeDust;
import org.example.deliveryCar.Furgon;
import org.example.utils.Finder;
import org.example.utils.Sorter;


import static org.example.enums.CoffeConditions.*;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new CoffeeDust("молотый якобс", 50.0, 7.0, COFFEE_DUST);
        Coffee coffee4 = new CoffeeDust("молотый якобс", 10.0, 7.0, COFFEE_DUST);
        Coffee coffee2 = new CoffeeDust("молотый якобс-2", 15.0, 12.0, COFFEE_DUST);
        Coffee coffee3 = new CoffeeGrain("зерно якобс", 20.0, 25.0, COFFEE_GRAIN);

        Furgon furgon = new Furgon("фура1", 130.0);
        furgon.downloadCoffee(coffee);
        furgon.downloadCoffee(coffee2);
        furgon.downloadCoffee(coffee3);
        furgon.downloadCoffee(coffee4);
        System.out.println(furgon.getFurgonLoading());

        System.out.println(coffee2.getPayback());
        System.out.println();
        System.out.println(furgon.getFurgonLoading());

        Sorter sorted =new Sorter();
        sorted.sortPayBack(furgon);
        System.out.println(furgon.getFurgonLoading());



    }
}