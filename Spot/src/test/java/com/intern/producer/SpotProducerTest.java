package com.intern.producer;

import com.intern.data.Spot;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SpotProducerTest {

    @Before
    public void setUp() {

    }

    @Test
    public void produce() {
        SpotProducer testee = new SpotProducer();
        Spot expected = new Spot(5);
        Spot result = testee.produce();
        Assert.assertEquals(expected, result);
    }
}