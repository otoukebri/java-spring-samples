package com.lightbend.akka.sample;

import akka.actor.ActorSystem;

import java.io.IOException;

public class IotMain {

    public static void main(String[] args) throws IOException {
        ActorSystem system = ActorSystem.create("iot-system");
        try {
            system.actorOf(IotSupervisor.props(), "iot-supervisor");
            System.out.println("Press ENTER to exit the system");
            System.in.read();
        } finally {
            system.terminate();
        }
    }
}
