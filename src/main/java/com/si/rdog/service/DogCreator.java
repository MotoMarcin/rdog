package com.si.rdog.service;
import com.si.rdog.model.Dog;
import com.si.rdog.repository.DogStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DogCreator {

    private Dog randomDog;

    @Autowired
    private DogStorage dogStorage;

    public Dog createRandomDog() {
        Dog randomDog = new Dog(RandomHelper.getRandomName(), RandomHelper.getRandomAge(), RandomHelper.getRandomBreed());
        System.out.println(" RANDOM DOG CREATED:\n" + randomDog.toString());
        dogStorage.addDog(randomDog);
        return randomDog;
    }
}
