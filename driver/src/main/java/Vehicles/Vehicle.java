package Vehicles;

public abstract class Vehicle implements IDriveable {

    int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int driveDistance(int distance) {
        return distance / this.speed;
    }

}
