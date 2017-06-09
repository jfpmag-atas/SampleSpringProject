package com.spring.sample.animal.noise.impl;

import com.spring.sample.animal.noise.Noise;

/**
 * Created by magatas on 6/8/2017.
 */
public class Meowing implements Noise {

    @Override
    public void makeNoise() {
        System.out.println("Meow! Meow! Purrrrrrrrr!");
    }
}
