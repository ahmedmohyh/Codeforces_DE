package AachenCodeAcm;

import java.util.Scanner;

public class maze {
public static void main (String[] args) {
    //System.out.println("Test");
    Scanner in = new Scanner(System.in);
    String y = in.nextLine();
    int x = Integer.valueOf(y);
    String [][] arr = new String[x][x];
    char [][] out  = new char[x][x];

    for (int i = 0; i<x; i++) {
        String line = in.nextLine();
        for (int j=0 ; j<x; j++){
            out[i][j] = line.charAt(j);
        }
    }

    for (int i =0; i<x; i++){
        String o = "";
        for (int j=0 ; j<x; j++){
            //System.out.print(out[i][j]);
            if (Character.isWhitespace(out[i][j]))
                o += ".";
            else
                o+= out[i][j];
        }
        System.out.println(o);
    }
}

}

