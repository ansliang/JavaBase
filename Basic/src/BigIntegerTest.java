import java.math.*;
import java.math.BigInteger;
import java.util.*;

/**
 * This program uses big numbers to compute the odds of winning the grand prize in a lottery.
 */

public class BigIntegerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many numbers do you need to draw?");
        int k = in.nextInt();

        System.out.println("What is the higest number you can draw?");
        int n = in.nextInt();

        /*
         * compute binomial coeffcient n*(n-1)*(n-2)*...*(n-k+1)/(1*2**...*k)
         */

        BigInteger lotteryOdds = BigInteger.valueOf(1); //将数值1转换成大数值

        for(int i=1; i<=k; i++)
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n-i+1).divide(BigInteger.valueOf(i)));

        System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
    }
}
