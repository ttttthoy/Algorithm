package baekjoon;
import java.util.Scanner;

public class Main_10950 {
    public static void main(String[] args){
        Scanner scc = new Scanner(System.in);

        int total = scc.nextInt();

        int input1 ;
        int input2 ;

        for (int i = 0; i < total; i++) {
            input1 = scc.nextInt();
            input2 = scc.nextInt();
            System.out.println(input1 + input2);
        }

    }
}
