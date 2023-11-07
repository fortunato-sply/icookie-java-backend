package com.fortunato.java_api;

import java.util.ArrayList;
import java.util.List;

public class Exercicio5 extends Exercicio {
    @Override
    public void Run()
    {
        List<Integer> pairs = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();

        for (int i = 0; i <= 1000; i++)
        {
            if (i % 2 == 0)
                pairs.add(i);
            else
                odds.add(i);
        }
        
        System.out.print("\nPares: [");
        for(int i = 0; i < pairs.size(); i++)
        {
            if (i == pairs.size() - 1)
                System.out.print(pairs.get(i) + "]");
            else
                System.out.print(pairs.get(i) + ", ");
        }

        System.out.print("\n\nImpares: [");
        for(int i = 0; i < odds.size(); i++)
        {
            if (i == odds.size() - 1)
                System.out.print(odds.get(i) + "]");
            else
                System.out.print(odds.get(i) + ", ");
        }
    }
}
