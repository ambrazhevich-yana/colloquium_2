import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;
import java.util.List;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void getFactorial() {
        Factorial fac = new Factorial();
        BigInteger result = fac.getFactorial(1);
        Assert.assertEquals(BigInteger.ONE, result);
         result = fac.getFactorial(2);
        Assert.assertEquals(BigInteger.TWO, result);
         result = fac.getFactorial(3);
        Assert.assertEquals(BigInteger.valueOf(6), result);
         result = fac.getFactorial(10);
        Assert.assertEquals(BigInteger.valueOf(3628800), result);
         result = fac.getFactorial(0);
        Assert.assertEquals(BigInteger.ONE, result);

    }

    @Test
    public void getFirstNFactorials() throws Incorrect {
        Factorial fac = new Factorial();
        List<BigInteger> result = fac.getFirstNFactorials(1);
        List<BigInteger> expected = List.of(
                BigInteger.ONE
        );
        assertEquals(expected, result);
        result = fac.getFirstNFactorials(2);
        expected = List.of(
                BigInteger.ONE,
                 BigInteger.TWO
        );
        assertEquals(expected, result);

        result = fac.getFirstNFactorials(3);
        expected = List.of(
                BigInteger.ONE,
                BigInteger.TWO,
                BigInteger.TWO.multiply(BigInteger.valueOf(3))
        );
        assertEquals(expected, result);
    }
}