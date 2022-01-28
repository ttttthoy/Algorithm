package chap01;

import java.util.Scanner;

public class Q4 {
    static int med3q (int a, int b, int c){
        if (a <= b)
            if (a < c)
                return c;
            else if (a > c)
                return a;
            else
                return a;

        else if (a < c && b < c)
            return b;
        else
            return b;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("세 정수의 중앙값");
        System.out.print("a의 값 :"); int a = sc.nextInt();
        System.out.print("b의 값 :"); int b = sc.nextInt();
        System.out.print("c의 값 :"); int c = sc.nextInt();

        System.out.println("중앙값은 : " + med3q(a,b,c) + "입니다");
    }
}
