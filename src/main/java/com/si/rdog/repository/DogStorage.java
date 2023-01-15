package com.si.rdog.repository;

import com.si.rdog.model.Dog;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DogStorage {

    private List<Dog> dogList = new ArrayList<>();

    public List<Dog> getDogList() {
        return dogList;
    }

    public void setDogList(List<Dog> dogList) {
        this.dogList = dogList;
    }

    public void addDog(Dog dogToAdd) {
        dogList.add(dogToAdd);
    }
//
//    public List<Dog> returnDogList() {
//        return dogList;
//    }

//    public void updateDogByName(String name, int age, Breed breed) {
//
//    }
}
