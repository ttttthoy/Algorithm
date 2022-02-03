package chap01;

import java.util.Scanner;

public class TriangleSum {

    //연습, 다른 풀이 업데이트

    static void regular(int n){
        for ( int i = 1; i <= n; i++){
            for ( int j = 1; j <= n; j++)
                System.out.print("*");
                System.out.println();
        }

    }

    static void leftB(int n){
        for ( int i = 1; i <= n; i++){
            for ( int j = 1; j <= i; j++ )
                System.out.print("*");
                System.out.println();
        }
    }

    static void leftT(int n){
        for ( int i = 1; i <= n; i++){
            for ( int j = 1; j <= (n - i) + 1; j++)
                System.out.print("*");
                System.out.println();
        }
    }

    static void rightB(int n){
        for ( int i = 1; i <= n; i++ ){
            for ( int j = 1; j <= n - i; j++ )
                System.out.print(" ");
            for ( int j = 1; j <= i; j++ )
                System.out.print("*");
                System.out.println();
        }
    }

    static void rightT(int n){
        for (int i = 1; i <= n; i++ ){
            for (int j = 1; j <= i; j++)
                System.out.print(" ");
            for (int j = 1; j <= (n - i) + 1; j++)
                System.out.print("*");
                System.out.println();
        }
    }




    public static void main (String[] args){
        Scanner sn = new Scanner(System.in);

        int n;

        do {
            System.out.print("몇각 인가요? : ");
            n = sn.nextInt();
        } while ( n <= 0);

        rightT(n);
    }
}
