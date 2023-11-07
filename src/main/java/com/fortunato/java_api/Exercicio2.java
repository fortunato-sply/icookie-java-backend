package com.fortunato.java_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 extends Exercicio {
    @Override
    public void Run()
    {
        Scanner reader = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        while(true) {
            System.out.println("Digite 0 para finalizar ou o número para adicionar no array: ");
            int num = reader.nextInt();

            if(num == 0)
                break;
            
            numbers.add(num);
        }

        reader.close();

        int sum = 0;
        for (int num : numbers)
            sum += num;
        
        System.out.println("Soma dos números: " + sum);
        return;
    }
}
