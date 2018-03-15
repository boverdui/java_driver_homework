package Vehicles;

public class DodgemCar extends Vehicle implements IDriveable {

    int seats;

    public DodgemCar(int speed, int seats) {
        super(speed);
        this.seats = seats;
    }

    public int getSeats() {
        return this.seats;
    }

    public int driveDistance(int distance) {
        return distance / this.speed;
    }

}
