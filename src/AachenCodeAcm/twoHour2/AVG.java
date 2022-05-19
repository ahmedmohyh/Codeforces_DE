package AachenCodeAcm.twoHour2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AVG {
    public static void main(String[] args){
        //System.out.println("Hi");
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();
        int m = in.nextInt();
        List<Integer> list = new ArrayList<>();
        int sum = 0;

        for (int i=0; i<n; i++) {
            int num = in.nextInt();
            sum += num;
            list.add(sum);
        }

        for (int  i=0; i<m; i++){

            int x = in.nextInt();
            int y = in.nextInt();

            if (x==1) {
                float cnt = list.get(y-1);
                float res = cnt/y;
                System.out.println(res);
            }
            else{
                float cnt = list.get(y-1)- list.get(x-2);
                float res = (cnt / (y-x+1));
                System.out.println(res);
            }
        }
    }
}
