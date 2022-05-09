import java.util.Scanner;
public class upperandlower {
    public static void main (String [] args){
        Scanner sc  = new Scanner (System.in);
        String S1 ;
        String S2 ;
        S1 = sc.next();
        S2 = sc.next();
        S1 = S1.toUpperCase();
        S2 = S2.toUpperCase();
        int cnt = 0;
        for (int i =0 ; i<S1.length(); i++){
            if (S1.charAt(i)>S2.charAt(i)) {
                cnt++;
            break;
            }
            else if (S1.charAt(i)<S2.charAt(i))
            {
                cnt--;
             break;
            }
        }
     System.out.println(cnt);


    }
}
