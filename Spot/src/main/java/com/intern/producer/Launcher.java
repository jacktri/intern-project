package com.intern.producer;

import com.intern.data.Spot;
import com.intern.publisher.Publisher;

public class Launcher {

    public static void main(String[] args){
        Producer<Spot> producer = new SpotProducer();
        Publisher<Spot> publisher = new SpotPublisher();
        Spot spotData = producer.produce();
        publisher.publish(spotData);
    }
}
