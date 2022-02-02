package chap01;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("사각형을 출력합니다");
        int i;

        do{
            System.out.print("단 수 : " );
            i = sc.nextInt();
        } while (i <= 0);

            for( int a = 1; a <= i; a++ ) {
                for (int b = 1; b <= i; b++)
                    System.out.print("*");
                    System.out.println();
            }
    }
}
