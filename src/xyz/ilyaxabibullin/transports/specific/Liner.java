package xyz.ilyaxabibullin.transports.specific;

import xyz.ilyaxabibullin.transports.base.IDelivery;
import xyz.ilyaxabibullin.transports.base.WaterTransport;

public class Liner extends WaterTransport implements IDelivery {
    public Liner() {
        super();
    }

    public Liner(double Speed, double Payload, String Brand, int StuffNumber, int PassengerNumber) {
        super(Speed, Payload, Brand, StuffNumber, PassengerNumber);
    }


    @Override
    public void delivery() {
        System.out.println("Реализация доставки для лайнера");
    }

    @Override
    public void showInformation() {
        System.out.println("Лайнер");
        super.showInformation();
    }

    @Override
    protected void swim() {
        System.out.println("Релизация передвижения для лайнера");
    }
}
