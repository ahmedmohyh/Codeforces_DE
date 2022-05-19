package AachenCodeAcm.twoHour2;

import java.util.Scanner;

public class subString {
    public static void main(String[] args) {
        //System.out.println("Hi");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i=0; i<n; i++){
            String str = in.next();

            int starT =0;
            int enD=0;

            for (int j= 0; j<str.length() -1; j++){

                if (str.charAt(j+1) >= str.charAt(j)){
                    enD = j+1;
                }
                else {
                    starT =j+1;
                    enD = j+1;
                }
            }
            System.out.println(str.substring(starT,enD+1));

        }
    }
}
