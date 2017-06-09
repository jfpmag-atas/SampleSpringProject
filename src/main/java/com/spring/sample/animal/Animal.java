package com.spring.sample.animal;

import com.spring.sample.animal.movement.Movement;
import com.spring.sample.animal.noise.Noise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by magatas on 6/8/2017.
 */
public class Animal {

    private Movement movement;

    private Noise noise;

    public void move() {
        this.movement.move();
    }

    public void makeNoise() {
        this.noise.makeNoise();
    }

    public Movement getMovement() {
        return movement;
    }

    public void setMovement(Movement movement) {
        this.movement = movement;
    }

    public Noise getNoise() {
        return noise;
    }

    public void setNoise(Noise noise) {
        this.noise = noise;
    }
}
