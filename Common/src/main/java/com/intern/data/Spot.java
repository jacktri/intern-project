package com.intern.data;

import java.io.Serializable;
import java.util.concurrent.ThreadLocalRandom;

public class Spot implements Serializable {

    private static final long serialVersionUID = 1L;
    private double value;
//    public double value = ThreadLocalRandom.current().nextDouble(-1, 1);

    public Spot(double value) {
        this.value = value;
    }
}
