package Vehicles;

public class TukTuk extends Vehicle implements IDriveable {

    private String colour;

    public TukTuk(int speed, String colour) {
        super(speed);
        this.colour = colour;
    }

    public String getColour() {
        return this.colour;
    }

    public int driveDistance(int distance) {
        return distance / this.speed;
    }

}
