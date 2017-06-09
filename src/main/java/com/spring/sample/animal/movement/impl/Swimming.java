package com.spring.sample.animal.movement.impl;

import com.spring.sample.animal.movement.Movement;

/**
 * Created by magatas on 6/8/2017.
 */
public class Swimming implements Movement {
    @Override
    public void move() {
        System.out.println("\\  /\\  /\\  /\\  /");
        System.out.println(" \\/  \\/  \\/  \\/ ");
    }
}
