package com.spring.sample;

import com.spring.sample.animal.Animal;
import com.spring.sample.animal.movement.Movement;
import com.spring.sample.animal.movement.impl.Walking;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by magatas on 6/8/2017.
 */
public class AppConfig {

    @Bean("swimming")
    public Movement getMovement(){
        return new Walking();
    }

    @Bean
    public Animal getAnimal(){
        Animal animal = new Animal();
        animal.setMovement(getMovement());

        return animal;
    }
}




