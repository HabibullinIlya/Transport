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

    public void setSpeed(double speed) {
        if(speed>0){
            Speed = speed;
        }else{
            System.out.println("некорректное значение");
        }
    }

    public double getPayload() {
        return Payload;
    }

    public void setPayload(double payload) {
        if(payload>0){
            Payload = payload;
        }else{
            System.out.println("некорректное значение");
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

    public void setStuffNumber(int stuffNumber) {
        if(stuffNumber>0){
            StuffNumber = stuffNumber;
        }else{
            System.out.println("некорректное значение");
        }

    }

    public int getPassengerNumber() {
        return PassengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        if(passengerNumber>0){
            PassengerNumber = passengerNumber;
        }else{
            System.out.println("некорректное значение");
        }
    }
}
