package xyz.ilyaxabibullin.transports.specific;


import xyz.ilyaxabibullin.transports.base.WaterTransport;

public class Tanker extends WaterTransport {

    public Tanker(){
        super();
    }
    public  Tanker(double Speed, double Payload, String Brand, int StuffNumber, int PassengerNumber){
        super(Speed,Payload,Brand,StuffNumber,PassengerNumber);
    }

    @Override
    public void showInformation() {
        System.out.println("Танкер");
        super.showInformation();
    }

    @Override
    protected void swim() {
        System.out.println("Реализация передвижения для танкера");
    }

    @Override
    public void delivery() {
        System.out.println("Реализация доставки для танкера");
    }
}
