import java.lang.String;
import java.math.BigDecimal;

public class CmpTest {
    public static void main(String[] args) {
        BigDecimal a = BigDecimal.ZERO,
                b = BigDecimal.ONE,
                c = BigDecimal.valueOf(1);
        System.out.printf("(a < b && c > a && b >= c && c >= b) = %b\n", (a < b && c > a && b >= c && c >= b));
        System.out.printf("Here a,b,c's class is %s, and a=%s, b=%s, c=%s\n", a.getClass().getSimpleName(), a, b, c);
    }
}
