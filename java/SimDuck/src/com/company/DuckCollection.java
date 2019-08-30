package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DuckCollection {
    List<DuckDetails> dd;
        DuckCollection () {
            dd = new ArrayList<>();
        }

        //DuckDetails dobj = new DuckDetails("duck","Mallard");

        public void addDuckType(DuckDetails DuckType)
        {
            dd.add(DuckType);
        }
        public String selectDuckType()
        {
            Random rnd = new Random();
            int selectduct = rnd.nextInt(dd.size());
//            String DuckType = String.valueOf(dd.get(selectduct));
            DuckDetails dobj = dd.get(selectduct);

            DuckAction(dobj);
            System.out.println("My name is "+dobj.getDuckType());
            return "My name is "+dobj.getDuckType();
        }

        public void DuckAction(DuckDetails dobj)
        {
            dobj.Quack();
            dobj.Swim();
            dobj.fly();

        }
    }


