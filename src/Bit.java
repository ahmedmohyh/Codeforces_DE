import java.util.Scanner;

public class Bit {
public static void main (String []args){
    Scanner sc  = new Scanner (System.in);
    int x ;
    int value = 0;
    String S ;
    x=  sc.nextInt();
    for (int i =0; i<x; i++){
S = sc.next();
for (int j= 0; j<S.length();j++){
     if (S.charAt(j)=='+') {
         value++;
         break;
     }
     else if (S.charAt(j)=='-') {
         value--;
         break;
     }

}
    }
    System.out.println(value);
}
}
