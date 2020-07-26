package com.lightbend.akka.sample;

import akka.actor.AbstractActor;
import akka.actor.Props;
import akka.event.Logging;
import akka.event.LoggingAdapter;

import java.util.Optional;

public class IotSupervisor extends AbstractActor {
  private final LoggingAdapter log = Logging.getLogger(getContext().getSystem(), this);

    public static Props props(){
        return Props.create(IotSupervisor.class);
    }

    // No need to handle any messages
    @Override
    public Receive createReceive() {
        return receiveBuilder().build();
    }

    @Override
    public void preStart() throws Exception {
        log.info("IoT Application started");
    }

    @Override
    public void postStop() throws Exception {
        log.info("IoT Application stopped");
    }



}