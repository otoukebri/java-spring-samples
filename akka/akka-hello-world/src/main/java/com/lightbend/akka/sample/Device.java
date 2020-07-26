package com.lightbend.akka.sample;

import akka.actor.AbstractActor;
import akka.actor.Props;
import akka.event.Logging;
import akka.event.LoggingAdapter;

import java.util.Optional;

public class Device extends AbstractActor {

    private final LoggingAdapter log = Logging.getLogger(getContext().getSystem(),
            this);

    private final String groupId;

    private final String deviceId;

    private Optional<Double> lastTemperatureReading = Optional.empty();

    public Device(String groupId, String deviceId){
        this.groupId = groupId;
        this.deviceId = deviceId;
    }

    public static Props props(String groupId, String deviceId){
        return Props.create(Device.class, deviceId);
    }

    @Override
    public Receive createReceive() {
        return receiveBuilder().match(ReadTemperature.class, r -> {
            getSender().tell(new RespondTemperature(r.requestId, lastTemperatureReading),
                    getSelf());
        }).build();
    }



    @Override
    public void preStart() throws Exception {
        log.info("Device actor {}-{} started", groupId, deviceId);
    }

    @Override
    public void postStop() throws Exception {
        log.info("Device actor {}-{} stopped", groupId, deviceId);
    }

    public static final class ReadTemperature {
        long requestId;

        public ReadTemperature(long requestId) {
            this.requestId = requestId;
        }
    }

    public static final class RespondTemperature {
        long requestId;
        Optional<Double> value;

        public RespondTemperature(long requestId, Optional<Double> value) {
            this.requestId = requestId;
            this.value = value;
        }
    }

    public static final class RecordTemperature {
        final double value;

        public RecordTemperature(double value) {
            this.value = value;
        }
    }
}
