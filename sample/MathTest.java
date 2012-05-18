import java.math.BigInteger;

public class MathTest {
    public static void main(String[] args) {
        BigInteger a = BigInteger.ONE,
                b = BigInteger.TEN,
                c = a + b * b + b/b;
        System.out.println(c.equals(BigInteger.valueOf(102)));
	System.out.println((-c).toString().equals("-102"));
    }
}
