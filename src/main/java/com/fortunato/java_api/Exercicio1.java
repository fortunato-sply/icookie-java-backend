package com.fortunato.java_api;

public class Exercicio1 extends Exercicio {
    @Override
    public void Run()
    {
        double[] numbers = { 10, 7.5, 4, 2 };

        double med = 0;
        for(int i = 0; i < numbers.length; i++)
            med += numbers[i];
        

        med = med / numbers.length;
        
        System.out.println("Média: " + med);

        if (med >= 9)
            System.out.println("Aprovado! Parabéns");
        else if (med >= 7)
            System.out.println("Aprovado!");
        else if (med >= 4)
            System.out.println("Recuperação.");
        else
            System.out.println("Reprovado.");
    }
}
