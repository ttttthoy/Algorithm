package baekjoon;
import java.util.Scanner;

public class Main_11022 {
    public static void main(String[] args){
        Scanner scc = new Scanner(System.in);

        int input = scc.nextInt();

        for (int i = 0; i < input; i++) {
            int A = scc.nextInt();
            int B = scc.nextInt();

            int result = A + B;
            System.out.println("Case #" + (i+1) + ": " + A + " + " + B + " = " + result);
        }
        scc.close();
    }
}
