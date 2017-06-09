package com.spring.sample;

import com.spring.sample.animal.Animal;
import com.spring.sample.animal.movement.Movement;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by magatas on 6/6/2017.
 */
public class SampleSpringRunner {

    public static void main(String args[]){
//        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//
//        context.scan("com.spring.sample.animal");
//        context.refresh();

        Animal animal = context.getBean("animal", Animal.class);
        animal.move();
        animal.makeNoise();
    }
}
