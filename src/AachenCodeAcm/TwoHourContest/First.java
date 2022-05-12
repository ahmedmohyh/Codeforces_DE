package AachenCodeAcm.TwoHourContest;

import java.lang.reflect.Array;
import java.util.*;

public class First {
    public static  void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String y = in.nextLine();
        Long x = Long.valueOf(y);
        List<Long> list = new ArrayList<>();

        for (int i=0; i<x; i++) {
            String m = in.nextLine();
            Long h = Long.valueOf(m);
            list.add(h);
        }
        Collections.sort(list);
        for (int i=0; i< x-1; i++) {
            System.out.println(list.get(i));
        }

        long max= 0;
        for (int i=0; i< x-1; i++) {
            if (Math.abs(list.get(i+1)-list.get(i)) > max)
                max = Math.abs(list.get(i+1)-list.get(i));
        }
        System.out.println(max);
    }

}
