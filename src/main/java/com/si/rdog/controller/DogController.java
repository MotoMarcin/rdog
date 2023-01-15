package com.si.rdog.controller;

import com.si.rdog.model.Breed;
import com.si.rdog.model.Dog;
import com.si.rdog.repository.DogStorage;
import com.si.rdog.service.DogCreator;
import com.si.rdog.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.si.rdog.model.Breed.MALTIPOO;

@RestController
public class DogController {

    @Autowired
    private DogStorage dogStorage;

    @Autowired
    private DogService dogService;

    @Autowired    private DogCreator dogCreator;



    public DogController(DogStorage dogStorage) {
        this.dogStorage = dogStorage;
    }

//    @GetMapping("/update")
//    public void update
//            (@RequestParam String name,
//             @RequestParam int age,
//             @RequestParam Breed breed) {
//        for (Dog dogToUpdate : dogStorage.returnDogList()) {
//            if (dogToUpdate.getName().equals(name)) {
//                dogToUpdate.setAge(age);
//                dogToUpdate.setBreed(breed);
//            }
//        }
//    }

    @GetMapping("/all")
    public List<Dog> all() {
        return dogService.allDogs();
    }

    @GetMapping("/random")
    public Dog random() {
        return dogCreator.createRandomDog();
    }

    @PostMapping("/add")
    public void add(@RequestBody Dog dog) {
        dogService.addDog(dog);
    }

    @PutMapping("/update/{name}")
//    public void update (@RequestParam(name="name") String name) {
//        System.out.println("WTF? " + name + "???");
//        dogService.updateDog(name);
//    }
    public void update(@PathVariable(value = "name") String name) {
        System.out.println("WTF? " + name + "???");
        dogService.updateDog(name);
    }
//    public voidDog add(@RequestParam String name, @RequestParam int age) {
//        Dog dog = new Dog(name, age, MALTIPOO);
//        dogStorage.addDog(dog);
//    }
//        DogStorage.addDog(DogCreator.createRandomDog());
//
//    }


//    Create a DogController class in the controller layer
//     to let others interact with the dogs.
//    This layer must contain methods to get all dogs, create a random dog,
//     add a specific dog, or update the first dog of a given name.
//    To achieve this behavior, this class must not contain the full logic in itself.
//    Instead, it must be wired with another class responsible for such services.
//
//    The class contains the RestController behavior.
//
//    The class is wired with DogStorage
//
//    The controller has a GET endpoint for returning all stored dogs.
//
//    The controller has a GET endpoint for returning a randomly created dog, which is stored by DogStorage.
//
//    The controller has a POST endpoint for adding a new dog. The dog's data is kept in the request body.
//
//    The controller has a PUT endpoint for updating the first dog with a given name.
//    The name is provided in the path variable. Age and breed properties can be updated in the request body.
}
