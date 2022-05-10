package AachenCodeAcm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sums {
public static void main(String [] args) {

    Scanner in = new Scanner(System.in);
    String y = in.nextLine();
    String m = in.nextLine();

    List<Integer> arr = new ArrayList<>();
    List<Integer> arr2 = new ArrayList<>();

    int L_length = Integer.valueOf(y);
    int m_length = Integer.valueOf(m);


    for (int i=0 ; i<L_length; i++) {
        String x = in.nextLine();
        arr.add(Integer.valueOf(x));
    }

    for (int i=0 ; i<m_length; i++) {
        String x = in.nextLine();
        arr2.add(Integer.valueOf(x));
    }

    for (int i=0; i<m_length; i++) {
        int val = arr.get(i);
        if (val ==0)
        {
            System.out.println("YES");
            continue;
        }
        int sumTest = 0;
        for (int j=0 ; j<L_length; j++){
            if (val == sumTest){
                System.out.println("YES");
                break;
            }
            else
                sumTest += arr.get(j);
        }
        if (val != sumTest)
            System.out.println("NO");
    }

}

}
