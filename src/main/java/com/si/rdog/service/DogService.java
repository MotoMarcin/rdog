package com.si.rdog.service;

import com.si.rdog.model.Breed;
import com.si.rdog.model.Dog;
import com.si.rdog.repository.DogStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.data.repository.query.ParameterOutOfBoundsException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogService {

    @Autowired
    private DogStorage dogStorage;
    public List<Dog> allDogs() {
        return dogStorage.getDogList();
    }


    public void addDog(Dog dog) {
        dogStorage.addDog(dog);
    }

    public void updateDog(String name) {
        Dog dogToUpdate = dogStorage.getDogList()
                .stream()
                .filter(dog -> name.equals(dog.getName()))
                .findAny()
                .orElseThrow(() -> new NoSuchDogException("There is no dog with name of " + name));
        if (dogToUpdate != null) {
            dogToUpdate.setAge(11);
            dogToUpdate.setBreed(Breed.MUTT);
        } else System.out.println("There is no dog with name of " + name);

    }
}
