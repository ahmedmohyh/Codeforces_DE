import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class Even_odds {
public static void main (String [] args ){
    Scanner sc = new Scanner(System.in);
    long n,k;
    n = sc.nextLong();
    k = sc.nextLong();
    if (n%2==0){
        if (k<=(n/2)){
            long  cnt  = ((2*k)-1);
            System.out.println(cnt);
        }
        else {
            k = k-(n/2);
            System.out.println((2*k));
        }
    }
    else {
        if (k<=((n+1)/2)){
            long cnt  = ((2*k)-1);
            System.out.println(cnt);
        }
        else {
            k = k - ((n + 1) / 2);
            System.out.println((2 * k));
        }


    }
}
}
