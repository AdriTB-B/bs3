package com.adri.bs3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@SpringBootApplication
public class EjercicioBs3SpringApplication {
	public static String[] valores;
	public static void main(String[] args) {
		valores = args;
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
	@Bean
	CommandLineRunner saludo3(){
		Arrays.asList(valores).forEach(System.out::println);
		return new Tercera();
	}

}
//Los mensajes se muestran en orden de creación
// y PostConstruct que es la primera se ejecuta
// antes de iniciar el programa en el servidor.
// Las otras dos su método run se ejecuta al iniciar el programa en el servidor