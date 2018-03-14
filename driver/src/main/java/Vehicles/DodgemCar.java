package Vehicles;

public class DodgemCar extends Vehicle {

    int seats;

    public DodgemCar(int speed, int seats) {
        super(speed);
        this.seats = seats;
    }

    public int getSeats() {
        return this.seats;
    }

}
