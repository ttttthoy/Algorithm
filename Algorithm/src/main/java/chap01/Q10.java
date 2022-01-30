package chap01;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("a의 값 : ");
        int a = sc.nextInt();
        System.out.print("b의 값 : ");
        int b = sc.nextInt();

        do{
            System.out.println("a보다 큰 값을 입력하세요!");
            b = sc.nextInt();
        } while (a > b) ;

        System.out.println("b의 값 : " + b );

        int sub = b - a ;

        System.out.println("b-a는 " + sub + "입니다");

    }
}
