package baekjoon;
import java.util.Arrays;
import java.util.Scanner;

public class Main_10871 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int A = sc.nextInt();

            if (A < x)
                sb.append(A + " ");

        }

        System.out.println(sb);

    }
}
