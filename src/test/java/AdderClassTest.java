import model.Adder;
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
        assertEquals(0, Adder.adder(5,-5).intValue());
    }

}
