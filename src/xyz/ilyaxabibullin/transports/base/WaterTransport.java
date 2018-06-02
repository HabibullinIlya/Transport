package xyz.ilyaxabibullin.transports.base;

public abstract class WaterTransport extends Transport {

    protected WaterTransport(){
    }

    protected WaterTransport(double Speed, double Payload, String Brand, int StuffNumber, int PassengerNumber) {
        super(Speed, Payload, Brand, StuffNumber, PassengerNumber);
    }
    protected abstract void swim();
}
