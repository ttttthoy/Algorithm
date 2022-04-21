package baekjoon;

import java.util.Scanner;

public class Main_11720 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int inputNum = sc.nextInt();
        String a = sc.next();

        sc.close();

        int sum = 0;

        for (int i = 0; i < inputNum; i++){
            sum += a.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}
