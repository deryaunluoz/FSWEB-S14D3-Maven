package org.example;

import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;
import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Car ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Car holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

        System.out.println("----------------------------------------");

        CarSkeleton gasCar = new GasPoweredCar("Corolla", "Compact gas car", 15.5, 4);
        CarSkeleton electricCar = new ElectricCar("Model 3", "Electric sedan", 6.0, 75);
        CarSkeleton hybridCar = new HybridCar("Prius", "Hybrid hatchback", 22.0, 8, 4);

        CarSkeleton[] cars = {gasCar, electricCar, hybridCar};

        for (CarSkeleton c : cars) {
            System.out.println("Type: " + c.getClass().getSimpleName());
            c.startEngine();
            c.drive();
            System.out.println();
        }
    }
}