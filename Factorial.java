import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Factorial {

    public static BigInteger getFactorial(int f) {
        BigInteger result = BigInteger.ONE;
        if (f==0)return result;
        for (int i = 1; i <= f; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
    public List<BigInteger> getFirstNFactorials(int n) throws Incorrect {
        if (n < 0) {
            throw new Incorrect("n negative :(");
        }
        if (n == 0) {
            return new ArrayList<>();
        }

        List<BigInteger> factorials = new ArrayList<>();
        factorials.add(BigInteger.ONE);
        for (int i = 0; i < n - 1; i++) {
            BigInteger factorial = factorials.get(i).multiply(BigInteger.valueOf(i + 2));
            factorials.add(factorial);
        }
        return factorials;
    }

}

 class Incorrect extends Exception {
    public Incorrect(String message) {
        super(message);
    }
}