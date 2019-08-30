package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DuckCollection dcobj = new DuckCollection();
        List<String> dd = Arrays.asList("Mallard","Redhead","Marbled","rubber");

        dcobj.addDuckType(new DuckDetails("duck1","Mallard"));
        dcobj.addDuckType(new DuckDetails("duck2","Redhead"));
        dcobj.addDuckType(new DuckDetails("duck3","Marbled"));
        dcobj.addDuckType(new DuckDetails("duck4","rubber"));
        dcobj.selectDuckType();

    }
}
