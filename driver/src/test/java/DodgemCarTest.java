import Vehicles.DodgemCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemCarTest {

    DodgemCar dodgemCar;

    @Before
    public void before() {
        dodgemCar = new DodgemCar(20,4);
    }

    @Test
    public void hasSpeed() {
        assertEquals(20, dodgemCar.getSpeed());
    }

    @Test
    public void hasSeats() {
        assertEquals(4, dodgemCar.getSeats());
    }

}
