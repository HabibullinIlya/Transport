package xyz.ilyaxabibullin.transports.specific;

import xyz.ilyaxabibullin.transports.base.AirTransportation;
import xyz.ilyaxabibullin.transports.base.IDelivery;

public class Helicopter extends AirTransportation implements IDelivery {
    public Helicopter() {
        super();
    }

    public Helicopter(double Speed, double Payload, String Brand, int StuffNumber, int PassengerNumber) {
        super(Speed, Payload, Brand, StuffNumber, PassengerNumber);
    }

    @Override
    protected void fly() {
        System.out.println("Реализация полета для вертолета");
    }

    @Override
    public void delivery() {
        System.out.println("Реализация доставки для вертолета");
    }

    @Override
    public void showInformation() {
        System.out.println("Вертолет");
        super.showInformation();
    }
}
