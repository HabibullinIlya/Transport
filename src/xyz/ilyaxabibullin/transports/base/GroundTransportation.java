package xyz.ilyaxabibullin.transports.base;

public abstract class GroundTransportation extends Transport {
    protected GroundTransportation(){
    }

    protected GroundTransportation (double Speed, double Payload, String Brand, int StuffNumber, int PassengerNumber) {
        super(Speed, Payload, Brand, StuffNumber, PassengerNumber);
    }
    protected abstract void go();
}
