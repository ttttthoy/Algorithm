package baekjoon;

import java.util.Scanner;

public class Main_2522 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        for (int i=1; i<=num; i++){
            for (int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1; i<=num-1; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=num-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
