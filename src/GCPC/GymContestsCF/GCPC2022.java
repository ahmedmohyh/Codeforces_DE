package GCPC.GymContestsCF;

import java.util.*;

public class GCPC2022 {
    public static void main (String[]args ){
        Scanner  s= new Scanner((System.in));
        int n,q;
        n = s.nextInt();
        q = s.nextInt();
        boolean[] array = new boolean[n+1];



        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();

        Arrays.fill(array, Boolean.TRUE);

        for (int i=0; i<q; i++) {
            String input = s.next();
            char operator = input.charAt(0);

            String[] subs = input.split("\\s+");

            if (operator == '?'){
                int a,b;
                a = s.nextInt();
                b= s.nextInt();
                if (!array[a] || !array[b]){
                    System.out.println("impossible");
                    continue;
                }

                else {
                    boolean leftPossbile = true;
                    boolean rightPossible = true;

                    int big, small;
                    if (a<b){
                        small = a;
                        big =b;
                    }
                    else{
                        big = a;
                        small = b;

                    }
                    for (var entry : map.entrySet()) {
                       // System.out.println(entry.getKey() + "/" + entry.getValue());
                        if (!leftPossbile && !rightPossible )
                            break;

                        if (entry.getKey()>= small && entry.getKey() <= big)
                            rightPossible=  false;

                        else if ((entry.getKey()>= big && entry.getKey() <= n) || (entry.getKey()<= small))
                            leftPossbile = false;
                    }
                    if (leftPossbile || rightPossible)
                        System.out.println("possible");
                    else
                        System.out.println("impossilbe");



                }


                }

            else if (operator == '+') {
                int steet  = s.nextInt();
                map.remove(steet);
                array[s.nextInt()] = true;
            }

            else {
               int street =  s.nextInt();
                map.put(street,false);
                array[street] = false;

            }

        }
    }
}
