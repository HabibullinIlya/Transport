package xyz.ilyaxabibullin.transports;

import xyz.ilyaxabibullin.transports.base.Transport;
import xyz.ilyaxabibullin.transports.specific.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Transports {
    ArrayList<Transport> TransportPark = new ArrayList<>();

    public void run() {
        Scanner in = new Scanner(System.in);
        Transports transports = new Transports();
        while (true) {
            System.out.println("help: \n  add - добавить транспорт \n ls - показать весь транспорт" +
                    " \n exit - выход");
            String userInput = in.nextLine();
            switch (userInput) {
                case ("add"):
                    transports.inData(in);
                    break;
                case ("ls"):
                    if (transports.TransportPark.size() == 0) {
                        System.out.println("Список пуст. Внесите данные");
                    }else {
                        System.out.println();
                        transports.TransportPark.forEach((t) -> t.showInformation());
                        System.out.println();
                    }
                    break;
                case ("exit"):
                    return;
                default:
                    break;

            }

        }


    }

    private void inData(Scanner in) {

        System.out.println("Создание транспортного средства");
        System.out.println("Выберети тип транспортного средства");

        System.out.println("1.Танкер");
        System.out.println("2.Лайнер");
        System.out.println("3.Вертолет");
        System.out.println("4.Самолет");
        System.out.println("5.Железнодорожный состав");
        System.out.println("6.Грузовик");
        System.out.println("7.Автомобиль");
        System.out.println("Выберете номер типа транспортого средства или введите его тип полностью");
        String userInput = in.nextLine();

        //userInput.intern();

        String brand;
        double speed;
        double payload;
        int stuffNumber;
        int passengerNumber;

        switch (userInput) {
            case ("Танкер"):
            case ("1"):

                System.out.println("выбран танкер");

                System.out.print("Название: ");
                brand = in.nextLine();

                System.out.print("Скорость (км/ч): ");
                speed = in.nextDouble();

                System.out.print("Грузоподъемность (тонн): ");
                payload = in.nextDouble();

                System.out.print("Количество персонала: ");
                stuffNumber = in.nextInt();

                System.out.print("Количество пассажиров: ");
                passengerNumber = in.nextInt();
                Tanker tanker = new Tanker(speed,payload,brand,stuffNumber,passengerNumber);
                TransportPark.add(tanker);

                tanker.showInformation();


                break;
            case ("Лайнер"):
            case ("2"):
                System.out.println("выбран лайнер");

                System.out.print("Название: ");
                brand = in.nextLine();

                System.out.print("Скорость (км/ч): ");
                speed = in.nextDouble();

                System.out.print("Грузоподъемность (тонн): ");
                payload = in.nextDouble();

                System.out.print("Количество персонала: ");
                stuffNumber = in.nextInt();

                System.out.print("Количество пассажиров: ");
                passengerNumber = in.nextInt();
                Liner liner = new Liner(speed,payload,brand,stuffNumber,passengerNumber);

                TransportPark.add(liner);

                break;
            case ("Вертолет"):
            case ("3"):
                System.out.println("Выбран вертолет");
                System.out.print("Название: ");
                brand = in.nextLine();

                System.out.print("Скорость (км/ч): ");
                speed = in.nextDouble();

                System.out.print("Грузоподъемность (тонн): ");
                payload = in.nextDouble();

                System.out.print("Количество персонала: ");
                stuffNumber = in.nextInt();

                System.out.print("Количество пассажиров: ");
                passengerNumber = in.nextInt();

                Helicopter helicopter = new Helicopter(speed,payload,brand,stuffNumber,passengerNumber);

                TransportPark.add(helicopter);
                break;
            case ("Самолет"):
            case ("4"):
                System.out.println("Выбран самолет");

                System.out.print("Название: ");
                brand = in.nextLine();

                System.out.print("Скорость (км/ч): ");
                speed = in.nextDouble();

                System.out.print("Грузоподъемность (тонн): ");
                payload = in.nextDouble();

                System.out.print("Количество персонала: ");
                stuffNumber = in.nextInt();

                System.out.print("Количество пассажиров: ");
                passengerNumber = in.nextInt();

                Aircraft aircraft = new Aircraft(speed,payload,brand,stuffNumber,passengerNumber);

                TransportPark.add(aircraft);

                break;
            case ("Железнодорожный состав"):
            case ("5"):
                System.out.println("Выбран Железнодорожный состав");

                System.out.print("Название: ");
                brand = in.nextLine();

                System.out.print("Скорость (км/ч): ");
                speed = in.nextDouble();

                System.out.print("Грузоподъемность (тонн): ");
                payload = in.nextDouble();

                System.out.print("Количество персонала: ");
                stuffNumber = in.nextInt();

                System.out.print("Количество пассажиров: ");
                passengerNumber = in.nextInt();
                Train train = new Train(speed,payload,brand,stuffNumber,passengerNumber);

                TransportPark.add(train);

                break;
            case ("Грузовик"):
            case ("6"):
                System.out.println("грузовик");
                System.out.print("Название: ");
                brand = in.nextLine();

                System.out.print("Скорость (км/ч): ");
                speed = in.nextDouble();

                System.out.print("Грузоподъемность (тонн): ");
                payload = in.nextDouble();

                System.out.print("Количество персонала: ");
                stuffNumber = in.nextInt();

                System.out.print("Количество пассажиров: ");
                passengerNumber = in.nextInt();

                Truck truck = new Truck(speed,payload,brand,stuffNumber,passengerNumber);

                TransportPark.add(truck);
                break;
            case ("Автомобиль"):
            case ("7"):
                System.out.println("автомобиль");
                System.out.print("Название: ");
                brand = in.nextLine();

                System.out.print("Скорость (км/ч): ");
                speed = in.nextDouble();

                System.out.print("Грузоподъемность (тонн): ");
                payload = in.nextDouble();

                System.out.print("Количество персонала: ");
                stuffNumber = in.nextInt();

                System.out.print("Количество пассажиров: ");
                passengerNumber = in.nextInt();

                Car car = new Car(speed,payload,brand,stuffNumber,passengerNumber);
                TransportPark.add(car);

                break;

            default:
                System.out.print("Некорректно введен ответ");
        }

    }
}
