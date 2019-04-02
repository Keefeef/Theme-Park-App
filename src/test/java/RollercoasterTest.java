import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RollercoasterTest {
    Rollercoaster rollercoaster;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Thunder Mountain");
    }
    @Test
    public void canGetName(){
        assertEquals("Thunder Mountain", rollercoaster.getName());
    }
    @Test
    public void canGetDefaultPrice(){
        assertEquals(10.0, rollercoaster.defaultPrice());
    }
}
