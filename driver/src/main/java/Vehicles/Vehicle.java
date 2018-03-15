package Vehicles;

public abstract class Vehicle {

    protected int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

}
