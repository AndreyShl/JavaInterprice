package org.example.utils;

import org.example.comparators.PayBackComparator;
import org.example.comparators.PriceComparator;
import org.example.comparators.SizeComparator;
import org.example.deliveryCar.Furgon;

public class Sorter {

    public void sortPayBack(Furgon furgon){
        furgon.getFurgonLoading().sort(new PayBackComparator());
    }
    public void sortPrice(Furgon furgon){
        furgon.getFurgonLoading().sort(new PriceComparator());
    }
    public void sortSize(Furgon furgon){
        furgon.getFurgonLoading().sort(new SizeComparator());
    }
}
