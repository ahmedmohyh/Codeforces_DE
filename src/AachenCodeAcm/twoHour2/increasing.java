package AachenCodeAcm.twoHour2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class increasing {
    public static void main(String[] args) {
        //System.out.println("Hi");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> list = new ArrayList<>();
        list.add(in.nextInt());
        int cnt = 0;

        for (int i=1; i<n; i++){
            int num = in.nextInt();

         if (num <= list.get(i-1))    {
             int move =  list.get(i-1) -num +1;
             cnt += move;
             list.add(num+move);
         }
         else {
             list.add(num);
         }

        }
        System.out.println(cnt);
    }
}
