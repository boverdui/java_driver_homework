import Vehicles.DodgemCar;
import Vehicles.QuadBike;
import Vehicles.TukTuk;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DriverTest {

    Driver driver;
    DodgemCar dodgemCar;
    QuadBike quadBike;
    TukTuk tukTuk;

    @After
    public void tearDown() throws Exception {

    }

    @Before
    public void before() {
        dodgemCar = new DodgemCar(5, 4);
        quadBike = new QuadBike(20, 500);
        tukTuk = new TukTuk(40, "pink");
        driver = new Driver("Verstappen", dodgemCar);
    }

    @Test
    public void hasName() {
        assertEquals("Verstappen", driver.getName());
    }

    @Test
    public void hasVehicle() {
        assertEquals(dodgemCar, driver.getVehicle());
    }

    @Test
    public void canSetVehicle() {
        driver.setVehicle(quadBike);
        assertEquals(quadBike, driver.getVehicle());
    }

    @Test
    public void canDriveDistance() {
        driver.setVehicle(tukTuk);
        assertEquals(1, driver.driveDistance(40));
    }

}
