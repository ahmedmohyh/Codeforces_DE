package GCPC.GymContestsCF.PractisContest;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Hexagonal {
    public  static  void main(String[] args) {

        double  numberDivide = ((3*Math.sqrt(3))/2);
        DecimalFormat df = new DecimalFormat("#.########");
        df.setRoundingMode(RoundingMode.HALF_UP);

        Scanner in = new Scanner(System.in);
        long area = in.nextLong();

        double side = area / numberDivide;

        side = Math.sqrt(side);

        double premiter = side *6;

        System.out.println(df.format(premiter));



    }
}
