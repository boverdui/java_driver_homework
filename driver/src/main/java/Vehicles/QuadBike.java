package Vehicles;

public class QuadBike extends Vehicle implements IDriveable {

    private int enginecapacity;

    public QuadBike(int speed, int enginecapacity) {
        super(speed);
        this.enginecapacity = enginecapacity;
    }

    public int getEngineCapacity() {
        return this.enginecapacity;
    }

    public int driveDistance(int distance) {
        return distance / this.speed;
    }

}
