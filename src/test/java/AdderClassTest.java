import model.Adder;
import model.Divider;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdderClassTest {

    @Test
    public void adderPositiveNumberShowPositiveResultTest() {
        Adder adder = new Adder();
        int actualResult = adder.adder(5,5);
        int expectedResult = 10;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void adderOneNumberIsNegativeShowZeroResultTest(){
        Adder adder = new Adder();
        int actualResult = adder.adder(-5,5);
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void diderOneNumberIsNegativeShowZeroResultTest(){
        Divider divider = new Divider();
        double actualResult = divider.divider(5,5);
        double expectedResult = 1;
        assertEquals(expectedResult, actualResult, 0.1);
    }





}
