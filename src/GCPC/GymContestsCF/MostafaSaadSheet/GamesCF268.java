package GCPC.GymContestsCF.MostafaSaadSheet;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GamesCF268 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int teams = sc.nextInt();
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < teams; i++) {
            int h = sc.nextInt();
            int a = sc.nextInt();

            List<Integer> tempList = new ArrayList<>(1);
            tempList.add(h);
            tempList.add(a);
            list.add(tempList);
        }

        int counter = 0;

        for (int i = 0; i < teams; i++) {
            for (int j = i+1; j < teams; j++) {
          int homei = list.get(i).get(0);
          int awayi = list.get(i).get(1);
          int awayj = list.get(j).get(1);
          int homej = list.get(j).get(0);
          if (homei == awayj)
              counter++;
          if (awayi == homej)
              counter++;

            }

        }
        System.out.println(counter);
        }

}

