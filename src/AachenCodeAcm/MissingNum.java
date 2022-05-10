package AachenCodeAcm;

import java.util.*;

public class MissingNum {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        String y = in.nextLine();
        Long x = Long.valueOf(y);

        Long summation = ((x*(x+1))/2);
        Long sumSum = Long.valueOf(0);

        for (int i = 0; i < x - 1; i++) {
            String num = in.nextLine();
            Long number = Long.valueOf(num);
            sumSum += number;
        }

        System.out.println(summation - sumSum);
    }
}
