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
        System.out.println("7.Автобус");
        System.out.println("Выберете номер типа транспортого средства или введите его тип полностью");
        String userInput = in.nextLine();

        //userInput.intern();

        switch (userInput) {
            case ("Танкер"):
            case ("1"):

                System.out.println("выбран танкер");

                Tanker tanker = new Tanker();
                System.out.print("Название: ");
                tanker.setBrand(in.next());
                System.out.print("Скорость (км/ч): ");
                tanker.setSpeed(in.nextDouble());
                System.out.print("Грузоподъемность (тонн): ");
                tanker.setPayload(in.nextDouble());
                System.out.print("Количество персонала: ");
                tanker.setStuffNumber(in.nextInt());
                System.out.print("Количество пассажиров: ");
                tanker.setPassengerNumber(in.nextInt());

                TransportPark.add(tanker);

                tanker.showInformation();


                break;
            case ("Лайнер"):
            case ("2"):
                System.out.println("выбран лайнер");

                Liner liner = new Liner();
                System.out.print("Название: ");
                liner.setBrand(in.next());
                System.out.print("Скорость (км/ч): ");
                liner.setSpeed(in.nextDouble());
                System.out.print("Грузоподъемность (тонн): ");
                liner.setPayload(in.nextDouble());
                System.out.print("Количество персонала: ");
                liner.setStuffNumber(in.nextInt());
                System.out.print("Количество пассажиров: ");
                liner.setPassengerNumber(in.nextInt());

                TransportPark.add(liner);

                break;
            case ("Вертолет"):
            case ("3"):
                System.out.println("Выбран вертолет");
                Helicopter helicopter = new Helicopter();
                System.out.print("Название: ");
                helicopter.setBrand(in.next());
                System.out.print("Скорость (км/ч): ");
                helicopter.setSpeed(in.nextDouble());
                System.out.print("Грузоподъемность (тонн): ");
                helicopter.setPayload(in.nextDouble());
                System.out.print("Количество персонала: ");
                helicopter.setStuffNumber(in.nextInt());
                System.out.print("Количество пассажиров: ");
                helicopter.setPassengerNumber(in.nextInt());

                TransportPark.add(helicopter);
                break;
            case ("Самолет"):
            case ("4"):
                System.out.println("Выбран самолет");

                Aircraft aircraft = new Aircraft();
                System.out.print("Название: ");
                aircraft.setBrand(in.next());
                System.out.print("Скорость (км/ч): ");
                aircraft.setSpeed(in.nextDouble());
                System.out.print("Грузоподъемность (тонн): ");
                aircraft.setPayload(in.nextDouble());
                System.out.print("Количество персонала: ");
                aircraft.setStuffNumber(in.nextInt());
                System.out.print("Количество пассажиров: ");
                aircraft.setPassengerNumber(in.nextInt());

                TransportPark.add(aircraft);

                break;
            case ("Железнодорожный состав"):
            case ("5"):
                System.out.println("Выбран Железнодорожный состав");

                Train train = new Train();
                System.out.print("Название: ");

                train.setBrand(in.next());
                System.out.print("Скорость (км/ч): ");

                train.setSpeed(in.nextDouble());
                System.out.print("Грузоподъемность (тонн): ");
                train.setPayload(in.nextDouble());

                System.out.print("Количество персонала: ");
                train.setStuffNumber(in.nextInt());

                System.out.print("Количество пассажиров: ");
                train.setPassengerNumber(in.nextInt());

                TransportPark.add(train);

                break;
            case ("Грузовик"):
            case ("6"):
                System.out.println("грузовик");
                Truck truck = new Truck();

                System.out.print("Название: ");
                truck.setBrand(in.next());

                System.out.print("Скорость (км/ч): ");
                truck.setSpeed(in.nextDouble());

                System.out.print("Грузоподъемность (тонн): ");
                truck.setPayload(in.nextDouble());

                System.out.print("Количество персонала: ");
                truck.setStuffNumber(in.nextInt());

                System.out.print("Количество пассажиров: ");
                truck.setPassengerNumber(in.nextInt());

                TransportPark.add(truck);
                break;
            case ("Автобус"):
            case ("7"):
                System.out.println("автобус");
                Car car = new Car();

                System.out.print("Название: ");
                car.setBrand(in.next());

                System.out.print("Скорость (км/ч): ");
                car.setSpeed(in.nextDouble());

                System.out.print("Грузоподъемность (тонн): ");
                car.setPayload(in.nextDouble());

                System.out.print("Количество персонала: ");
                car.setStuffNumber(in.nextInt());

                System.out.print("Количество пассажиров: ");
                car.setPassengerNumber(in.nextInt());


                TransportPark.add(car);

                break;

            default:
                System.out.print("Некорректно введен ответ");
        }

    }
}
