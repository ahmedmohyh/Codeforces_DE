package GCPC.GymContestsCF;

import java.util.Scanner;

public class ContestPreparation {
    public static  void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();


        for (int i=0 ; i<t; i++) {

            int n  = in.nextInt();
            int m = in.nextInt();

            if (n ==0) {
                System.out.println(0);
                continue;
            }

            if (n % m ==0 )
            {
                int res  = n/m;
                res *=2;
                System.out.println(res);
                continue;
            }
            else if (n/m ==0){

                    System.out.println(2);
                    continue;
                }
                else {
                    int validNumofProblems = n - (m-(n%m));
                    int makingTime = n/m +1 ;
                    int ValidationTime = 0;

                    if (validNumofProblems %m != 0 )
                        ValidationTime   = validNumofProblems /m +1;

                    else
                        ValidationTime = validNumofProblems /m;

                    System.out.println(makingTime +ValidationTime );
                    continue;
                }
            }

        }

    }
