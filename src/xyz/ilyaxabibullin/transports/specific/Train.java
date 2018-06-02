package xyz.ilyaxabibullin.transports.specific;

import xyz.ilyaxabibullin.transports.base.GroundTransportation;

public class Train extends GroundTransportation {

    public Train() {
        super();
    }

    public Train(double Speed, double Payload, String Brand, int StuffNumber, int PassengerNumber) {
        super(Speed, Payload, Brand, StuffNumber, PassengerNumber);
    }

    @Override
    protected void go() {
        System.out.println("Реализация езды для поезда");
    }

    @Override
    public void delivery() {
        System.out.println("Реализация досавки для поезда");
    }

    @Override
    public void showInformation() {
        System.out.println("Железнодорожный состав");
        super.showInformation();
    }
}
