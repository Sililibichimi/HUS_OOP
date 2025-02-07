package oop_hus.lab10.strategy.example;

// A class calculate money when someone go somewhere by a vehicle
public class Cost {
    private int distance;
    private VehicleStrategy vehicleStrategy;

    public Cost(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setVehicleStrategy(VehicleStrategy vehicleStrategy) {
        this.vehicleStrategy = vehicleStrategy;
    }

    //return money
    public int money() {
        return distance * vehicleStrategy.money();
    }
}
