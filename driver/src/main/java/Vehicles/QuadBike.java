package Vehicles;

public class QuadBike extends Vehicle {

    int enginecapacity;

    public QuadBike(int speed, int enginecapacity) {
        super(speed);
        this.enginecapacity = enginecapacity;
    }

    public int getEngineCapacity() {
        return this.enginecapacity;
    }

}
