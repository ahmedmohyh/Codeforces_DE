package GCPC.GymContestsCF;

import java.util.Scanner;
import java.util.stream.IntStream;

public class GCPC18E {

    public static void main (String[] args) {


        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i =0 ; i<t ; i++ ){

            double a  = in.nextDouble();
            double b = in.nextDouble();

            long x =  Math.round((a * 100000));
            long y = Math.round((b * 100000));

            if (x == y)
            {

                System.out.println("2 2");
                continue;
            }

            long gcdNumber = gcd(x,y);

            if (gcdNumber == 0)
            {
                System.out.println("impossible");
                continue;
            }

            long q = x/gcdNumber;
            long p = y/gcdNumber;

            if (isPrime(q) && isPrime(p))
            {
                System.out.println(q + " " + p);
                continue;
            }
            else
            System.out.println("impossible");


        }


    }
    public static long gcd(long a, long b)
    {
        // Everything divides 0
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }

    public static boolean isPrime(long number)
    {
        if(number <= 2)
            return number == 2;
        else
            return  (number % 2) != 0
                    &&
                    IntStream.rangeClosed(3, (int) Math.sqrt(number))
                            .filter(n -> n % 2 != 0)
                            .noneMatch(n -> (number % n == 0));
    }

    public static  long f (char s[])
    {
        int len=s.length;
        long ans=0;
        int t=5;
        for(int i=0;i<len;i++)
        {
            if(s[i]!='.')
            {
                ans=1L*ans*10+s[i]-'0';
            }
            else
            {
                t=len-i-1;
            }
        }

        while(t-- > 0)
            ans=1L*ans*10;

        return ans;
    }
}
