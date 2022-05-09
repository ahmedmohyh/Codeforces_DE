import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class boyorgirl {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String myString= sc.nextLine();
        String noDuplicates;
        noDuplicates = Arrays.asList(myString.split(""))
                .stream()
                .distinct()
                .collect(Collectors.joining());
       int len = noDuplicates.length();
       if (len%2 ==0){
           System.out.println("CHAT WITH HER!");
       }
       else System.out.println("IGNORE HIM!");

    }
}
