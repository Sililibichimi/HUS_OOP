package oop_hus.lab10.strategy.example;

public class App {

    public static void main(String[] args) {
        Cost goingToSchool = new Cost(10000);
        VehicleStrategy car = new CarStrategy();
        VehicleStrategy bike = new BikeStrategy();
        VehicleStrategy plane = new PlaneStrategy();

        goingToSchool.setVehicleStrategy(car);
        System.out.println(goingToSchool.money());

        goingToSchool.setVehicleStrategy(bike);
        System.out.println(goingToSchool.money());
    }

}
