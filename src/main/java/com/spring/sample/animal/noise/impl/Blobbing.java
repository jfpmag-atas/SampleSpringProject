package com.spring.sample.animal.noise.impl;

import com.spring.sample.animal.noise.Noise;

/**
 * Created by magatas on 6/8/2017.
 */
public class Blobbing implements Noise {
    @Override
    public void makeNoise() {
        System.out.println("Blob Blob Blob Blob");
    }
}
