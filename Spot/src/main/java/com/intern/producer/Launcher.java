package com.intern.producer;

import com.intern.data.Spot;
import com.intern.publisher.Publisher;

public class Launcher {

    private Producer<Spot> producer;
    private Publisher<Spot> publisher;

    Launcher(Producer<Spot> producer, Publisher<Spot> publisher){
        this.producer = producer;
        this.publisher = publisher;
    }

    public void start(){
        Spot spotData = producer.produce();
        publisher.publish(spotData);
    }

    public static void main(String[] args){
        Launcher launcher = new Launcher(new SpotProducer(), new SpotPublisher());
        launcher.start();
    }
}
