package GCPC.GymContestsCF.MostafaSaadSheet;

import java.math.BigInteger;
import java.util.Scanner;

 class A_Product_49 {

    public static void main (String[] args) {

       do {
           Scanner scanner = new Scanner(System.in);
           BigInteger x = BigInteger.valueOf(-1);
           BigInteger y;
           x = scanner.nextBigInteger();
           y = scanner.nextBigInteger();
           BigInteger result = x.multiply(y);

           System.out.println(result);

       }while(true);
    }
}
