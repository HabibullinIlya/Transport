package xyz.ilyaxabibullin.transports.base;

public abstract class AirTransportation extends Transport {
    protected AirTransportation() {
    }

    protected AirTransportation(double Speed, double Payload, String Brand, int StuffNumber, int PassengerNumber) {
        super(Speed, Payload, Brand, StuffNumber, PassengerNumber);
    }

    protected abstract void fly();
}
