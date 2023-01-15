package com.si.rdog.service;

import com.si.rdog.model.Breed;

import java.util.Random;

public class RandomHelper {
    static Random drawn = new Random();

    private static final String[] NAMES = {
            "Alex", "Ash", "Billy", "Carol", "Charlie", "Cory", "Dale", "Danny", "Fran", "Gabby,",
            "Gail", "Hilary", "Jess", "Jo", "Jordan", "Kelly", "Lee", "Leslie", "Lynn",
            "Marty", "Mel", "Morgan", "Noel", "Pat", "Reggie", "Robbie", "Ruby", "Sam",
            "Shannon", "Sidney", "Steph", "Taylor", "Tracy", "Val", "Vic", "Vinnie", "Willy"
    };

    public static String getRandomName() {
        return NAMES[randomInt(0, NAMES.length - 1)];
    }

    public static int getRandomAge() {
        return randomInt(1, 19);
    }

    public static int randomInt(int lLim, int uLim) {

        int lottery = drawn.nextInt((uLim - lLim) + 1) + lLim;
        return lottery;
    }

    public static Breed getRandomBreed() {
        return Breed.values()[randomInt(1, Breed.values().length) - 1];
    }


}
