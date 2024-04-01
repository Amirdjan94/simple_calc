import model.Adder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdderClassTest {

    @Test
    public void adderPositiveNumberShowPositiveResultTest() {
        Adder adder = new Adder();
        int actualResult = adder.adder(5,5);
        int expectedResult = 10;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void adderOneNumberIsNegativeShowZeroResultTest(){
        Assertions.assertEquals(0, Adder.adder(5,-5));
    }

}
