package baekjoon;
import java.util.Scanner;

public class Main_11021 {
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        System.out.println("다 받음");

        for (int i = 0; i < input; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("Case #" + (i+1) +":" + (a+b));
        }
        sc.close();
    }
}
