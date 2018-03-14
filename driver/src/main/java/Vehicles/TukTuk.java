package Vehicles;

public class TukTuk extends Vehicle {

    String colour;

    public TukTuk(int speed, String colour) {
        super(speed);
        this.colour = colour;
    }

    public String getColour() {
        return this.colour;
    }

}
