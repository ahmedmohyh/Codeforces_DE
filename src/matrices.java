import java.util.Scanner;
public class matrices {
    public static void main(String[] args) {
        int cnt = 0;
        int row = 0;
        int clm = 0;
        Scanner sc = new Scanner(System.in);
        int[][] x = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                x[i][j] = sc.nextInt();
                if (x[i][j] == 1) {
                    row = i;
                    clm = j;
                }
            }

        }
        cnt += Math.abs(row - 2);
        cnt += Math.abs(clm - 2);
        System.out.println(cnt);

    }
}
