package xyz.ilyaxabibullin.transports.specific;

import xyz.ilyaxabibullin.transports.base.GroundTransportation;

public class Car extends GroundTransportation {

    public Car() {
        super();
    }

    public Car(double Speed, double Payload, String Brand, int StuffNumber, int PassengerNumber) {
        super(Speed, Payload, Brand, StuffNumber, PassengerNumber);
    }

    @Override
    protected void go() {
        System.out.println("Реализация езды для автомобиля");
    }

    @Override
    public void delivery() {
        System.out.println("Реализация доставки для автомобиля");
    }

    @Override
    public void showInformation() {
        System.out.println("Автомобиль");
        super.showInformation();
    }
}
