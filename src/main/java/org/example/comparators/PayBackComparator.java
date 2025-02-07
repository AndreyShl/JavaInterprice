package org.example.comparators;

import org.example.coffee.Coffee;

import java.util.Comparator;

public class PayBackComparator implements Comparator<Coffee>{

    @Override
    public int compare(Coffee o1, Coffee o2) {
        return Double.compare(o2.getPayback(),o1.getPayback());
    }
}