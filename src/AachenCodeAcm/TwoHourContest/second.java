package AachenCodeAcm.TwoHourContest;

import java.util.*;

public class second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();
        int m = in.nextInt();
        Map<Integer, List<Integer>> mp = new HashMap<>();
        int con= 0;
        for (int i=0; i<m; i++)
        {
            boolean x_found = false;
            boolean y_found = false;

            int x  = in.nextInt();
            int y = in.nextInt();

            List<Integer> list_x = mp.get(x);
            List<Integer> list_y = mp.get(y);

            if (list_x.size() ==0)
                mp.put(x,new ArrayList<>(y));
            else if (!list_x.contains(y));
//
//            mp.put()
//            if (preX != -1 && preX != y){
//                con++;
//                mp.put(preX,y);
//                x_found =true;
//            }
//
//            if (preY != -1 && preY != x){
//                con++;
//                mp.put(preY,x);
//                y_found = true;
//            }
//            if (!x_found)
//                 mp.put(x,y);
//            if (!y_found)
//                mp.put(y,x);

        }
        System.out.println(con);
    }


}
