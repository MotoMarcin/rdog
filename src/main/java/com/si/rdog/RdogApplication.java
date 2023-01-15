package com.si.rdog;

import com.si.rdog.model.Dog;
import com.si.rdog.service.DogCreator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RdogApplication {

	public static void main(String[] args) {
		SpringApplication.run(RdogApplication.class, args);
		System.out.println("ropoDok\n");
//		for (int i = 0; i < 10; i++) {
//			DogCreator.createRandomDog();
//		}
	}

}
