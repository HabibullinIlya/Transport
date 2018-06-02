package xyz.ilyaxabibullin.transports.specific;

import xyz.ilyaxabibullin.transports.base.AirTransportation;

public class Aircraft extends AirTransportation {
    public Aircraft() {
        super();
    }

    public Aircraft(double Speed, double Payload, String Brand, int StuffNumber, int PassengerNumber) {
        super(Speed, Payload, Brand, StuffNumber, PassengerNumber);
    }

    @Override
    protected void fly() {
        System.out.println("Реализация полета для самолета");
    }

    @Override
    public void delivery() {
        System.out.println("Реализация доставки для самолета");
    }

    @Override
    public void showInformation() {
        System.out.println("Самолет");
        super.showInformation();
    }
}
