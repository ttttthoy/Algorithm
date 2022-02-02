package chap01;

import java.util.Scanner;

public class Q15 {
    //왼쪽 아래가 직각
    static void triangleB(int n){
        for (int i = 1; i <= n; i ++){
            for (int j = 1; j <= i; j++)
                System.out.print("*");
                System.out.println();
        }
    }

    //왼쪽 위가 직각
    static void triangleU(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n - i + 1; j++)
                System.out.print("*");
                System.out.println();
        }
    }

    //오른쪽 위가 직각
    static void triangleRU(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i - 1; j++)
                System.out.print(" ");
            for (int j = 1; j <= n - i + 1; j++)
                System.out.print("*");
                System.out.println();
        }
    }

    //오른쪽 아래가 직각
    static void triangleRB(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
                System.out.println();
        }

    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("몇 단 직각삼각형 인가요?: ");
            n = sc.nextInt();
        } while ( n <= 0);

        triangleRB(n);
    }
}
