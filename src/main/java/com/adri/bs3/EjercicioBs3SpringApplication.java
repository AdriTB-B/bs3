package com.adri.bs3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class EjercicioBs3SpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjercicioBs3SpringApplication.class, args);
	}
	@PostConstruct
	public void saludo1(){
		System.out.println("Hola desde la clase inicial");
	}

	@Bean
	CommandLineRunner saludo2(){
		return new Segunda();
	}

}
