import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class IceCreamStallTest {
    IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Prices Ices", "James", 15);
    }
    @Test
    public void canGetName(){
        assertEquals("Prices Ices", iceCreamStall.getName());
    }
    @Test
    public void canGetOwnerName(){
        assertEquals("James", iceCreamStall.getOwnerName());
    }
    @Test
    public void canGetParkingSpot(){
        assertEquals(15, iceCreamStall.getParkingSpot());
    }

}
