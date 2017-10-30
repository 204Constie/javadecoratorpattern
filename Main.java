package com.company;

public class Main {

    public static void main(String[] args) {
        ICar car1 = new Airbags(new BasicCar());

        System.out.println(car1.add());
        System.out.println(car1.cost());
        System.out.println("discount on the next order: " + car1.discount() + "%");

        ICar car2 = new Airbags(new FancyColor(new ParkAssist(new BasicCar())));

        System.out.println(car2.add());
        System.out.println(car2.cost());
        System.out.println("discount on the next order: " + car2.discount() + "%");
    }
}
