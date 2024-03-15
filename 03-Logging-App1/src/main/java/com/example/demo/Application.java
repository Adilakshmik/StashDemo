package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {


	public void m2(){
		String a="vani";
		String b="nani";

	public void m1(){
		int a=10;
		int b=20;
		int c=30;

	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

	}

}
