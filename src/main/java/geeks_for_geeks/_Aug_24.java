package geeks_for_geeks;

import java.math.BigInteger;

public class _Aug_24 {
    public static void main(String[] args) {
        String s1 = "0033";
        String s2 = "2";

        System.out.println(multiplyStrings(s1,s2));
    }

    private static String multiplyStrings(String s1, String s2) {
        BigInteger num1 = new BigInteger(s1);
        BigInteger num2 = new BigInteger(s2);

        BigInteger result = num1.multiply(num2);

        return result.toString();
    }

}
