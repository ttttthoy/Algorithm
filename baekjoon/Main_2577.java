package baekjoon;
import java.util.Scanner;

public class Main_2577 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int result = A * B * C;

        int[] number = new int[10];

        while(result > 0) {
            number[result%10]++;
            result/=10;
        }

        for(int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }

    }
}
