package com.fortunato.java_api;

import java.util.ArrayList;
import java.util.List;

public class Exercicio4 extends Exercicio {
    @Override
    public void Run()
    {
        List<Integer> mods = new ArrayList<>();
        
        for (int i = 1000; i <= 1999; i++)
            if (i % 11 == 5)
                mods.add(i);
        
        for (int n : mods)
            System.out.println(n);
    }
}
