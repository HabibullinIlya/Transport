package xyz.ilyaxabibullin.transports.specific;

import xyz.ilyaxabibullin.transports.base.GroundTransportation;

public class Truck extends GroundTransportation {
    public Truck() {
        super();
    }

    public Truck(double Speed, double Payload, String Brand, int StuffNumber, int PassengerNumber) {
        super(Speed, Payload, Brand, StuffNumber, PassengerNumber);
    }

    @Override
    protected void go() {
        System.out.println("Реализация езды для грузовика ");
    }

    @Override
    public void delivery() {
        System.out.println("Реализация досавки для грузовика");
    }

    @Override
    public void showInformation() {
        System.out.println("Грузовик");
        super.showInformation();
    }
}
