package xyz.ilyaxabibullin.transports.base;

public abstract class Transport implements IDelivery {
    private double Speed;
    private double Payload;
    private String Brand;
    private int StuffNumber;
    private int PassengerNumber;

    protected Transport() {
    }

    protected Transport(double Speed, double Payload, String Brand, int StuffNumber, int PassengerNumber) {
        this.Speed = Speed;
        this.Payload = Payload;
        this.Brand = Brand;
        this.StuffNumber = StuffNumber;
        this.PassengerNumber = PassengerNumber;
    }

    public void showInformation(){
        System.out.println("Марка "+ getBrand());
        System.out.println("Грузоподъемность "+ getPayload()+ " тонн");
        System.out.println("Скорость  "+ getSpeed()+" (км/ч)");
        System.out.println("Количество персонала  "+ getStuffNumber());
        System.out.println("Количество пассажиров  "+ getPassengerNumber());
    }


    public double getSpeed() {
        return Speed;
    }

    public boolean setSpeed(double speed) {
        if(speed>0){
            Speed = speed;
            return true;
        }else{
            System.out.println("некорректное значение");
            return false;
        }
    }

    public double getPayload() {
        return Payload;
    }

    public boolean setPayload(double payload) {
        if(payload>0){
            Payload = payload;
            return true;
        }else{
            System.out.println("некорректное значение");
            return false;
        }

    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getStuffNumber() {
        return StuffNumber;
    }

    public boolean setStuffNumber(int stuffNumber) {
        if(stuffNumber>0){
            StuffNumber = stuffNumber;
            return true;
        }else{
            System.out.println("некорректное значение");
            return false;
        }

    }

    public int getPassengerNumber() {
        return PassengerNumber;
    }

    public boolean setPassengerNumber(int passengerNumber) {
        if(passengerNumber>0){
            PassengerNumber = passengerNumber;
            return true;
        }else{
            System.out.println("некорректное значение");
            return false;
        }
    }
}
