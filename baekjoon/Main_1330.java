package baekjoon;
import java.util.Scanner;

public class Main_1330 {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);

        int a = scc.nextInt();
        int b = scc.nextInt();

        if (a > b) {
            System.out.println(">");
        } if (a < b) {
            System.out.println("<");
        } if (a == b)
            System.out.println("==");
    }
}
