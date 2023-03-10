package com.example;

import java.util.List;

public class Lion {

    private final boolean hasMane;
    private final Predator predator;
    private final FelineMethods felineMethods;

    public Lion(String sex, Feline feline) throws Exception {
        this.predator = feline;
        this.felineMethods = feline;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public int getKittens() {
        return predator.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return felineMethods.getFood("Хищник");
    }
}
