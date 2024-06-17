import java.math.BigInteger;

public class factorial {
    public static void main(String[] args) {
        int number = 3; // The number to calculate the factorial of
        BigInteger fact = BigInteger.ONE;

        for (int i = 1; i <= number; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        System.out.println("Factorial of " + number + " is: " + fact);
    }
}
