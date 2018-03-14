import Vehicles.QuadBike;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuadBikeTest {

    QuadBike quadBike;

    @Before
    public void before() {
        quadBike = new QuadBike(30,500);
    }

    @Test
    public void hasSpeed() {
        assertEquals(30, quadBike.getSpeed());
    }

    @Test
    public void hasEngineCapacity() {
        assertEquals(500, quadBike.getEngineCapacity());
    }

}
