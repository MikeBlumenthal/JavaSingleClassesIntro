import org.junit.*;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle bottle;

    @Before
    public void before(){
        bottle = new WaterBottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, bottle.getVolume() );
    }

    @Test
    public void canDrink(){
        bottle.drink();
        assertEquals(90, bottle.getVolume() );
    }

    @Test
    public void canEmptyBottle(){
        bottle.empty();
        assertEquals(0, bottle.getVolume() );
    }

    @Test
    public void canFillBottle(){
        bottle.drink();
        bottle.drink();
        bottle.drink();
        bottle.fill();
        assertEquals(100, bottle.getVolume() );
    }


}
