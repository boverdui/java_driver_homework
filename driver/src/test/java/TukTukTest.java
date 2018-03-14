import Vehicles.TukTuk;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TukTukTest {

    TukTuk tukTuk;

    @Before
    public void before() {
        tukTuk = new TukTuk(40,"pink");
    }

    @Test
    public void hasSpeed() {
        assertEquals(40, tukTuk.getSpeed());
    }

    @Test
    public void hasColour() {
        assertEquals("pink", tukTuk.getColour());
    }

}
