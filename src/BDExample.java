import java.math.BigDecimal;

public class BDExample {

    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("0.3");

        System.out.println("bd2.multiply(bd1) = " + bd2.multiply(bd1));
        System.out.println(0.1f * 0.3f);
    }
}
