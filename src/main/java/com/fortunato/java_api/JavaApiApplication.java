package com.fortunato.java_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaApiApplication.class, args);
		Exercicio ex1 = new Exercicio1();
		Exercicio ex2 = new Exercicio2();
		Exercicio ex4 = new Exercicio4();
		Exercicio ex5 = new Exercicio5();

		ex5.Run();
	}

}
