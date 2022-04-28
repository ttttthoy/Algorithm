package baekjoon;

import java.util.Scanner;

public class Main_2445 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        for (int i = 1; i<=num; i++){
            for (int j = 0; j<i; j++){
                System.out.print("*");
            }
            for (int a = 2*num-i; a>0; a--){
                if (a>i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }

        for (int i =2; i<=num; i++) {
            for (int j = i; j <= num; j++) {
                System.out.print("*");
            }
            for (int k = 1; k < i * 2 - 1; k++) {
                System.out.print(" ");
            }
            for (int h = num; h >= i; h--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
