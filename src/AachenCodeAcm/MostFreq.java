package AachenCodeAcm;

import java.io.Console;
import java.util.*;

public class MostFreq {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String y = in.nextLine();
        int x = Integer.valueOf(y);

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < x; i++) {
            String word = in.nextLine();
            int val = map.getOrDefault(word, 0);

            if (val == 0) {
                map.put(word, 1);
            } else if (val > 0) {
                map.put(word, ++val);
            }
        }

        //System.out.println(map.get("mido"));
        System.out.println(map.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey());

    }
}
