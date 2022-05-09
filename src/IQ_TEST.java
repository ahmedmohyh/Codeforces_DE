import java.util.Scanner;

public class IQ_TEST {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in );
        int size=  sc.nextInt();
        int [] arr = new int [size];
        for (int i= 0; i<size; i++){
            arr[i]= sc.nextInt();

                }
        for (int i =0 ; i<size; i++){
            int cnt =0;
            for (int j = 0 ; j<size; j++){
                if (arr[i]%2!= arr[j]%2 ){
                    cnt++;
                }

            }
            if (cnt==size-1){
                System.out.println(i+1);
                break;
            }

        }



            }
        }
