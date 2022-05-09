import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class addition {

    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        List<Integer> x = new ArrayList<Integer>();
        for (int i = 0 ; i<S.length(); i++){
            if (S.charAt(i)!='+'){
                x.add(Integer.parseInt(String.valueOf(S.charAt(i))));
            }

    }
        Collections.sort(x);
        String neu="";
        for (int i = 0 ; i<x.size(); i++){
            neu += String.valueOf(x.get(i));
            if (i!=x.size()-1)
            neu+="+";
        }
        System.out.println(neu);

}
}
