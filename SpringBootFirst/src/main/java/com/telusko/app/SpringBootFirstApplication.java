package com.telusko.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFirstApplication.class, args);
		//System.out.println("Hello World");
		
//		Alien obj= new Alien();
//		obj.code();
		
	
		Alien obj= context.getBean(Alien.class);
		obj.code();
		
	}

}
