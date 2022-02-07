package chap01;

import java.util.ArrayList;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("자리수를 구하고자 하는 수는?");
        n = sc.nextInt();

        while ( n < 0 ){
            System.out.println("양의 정수만 입력해 주세요!");
            n = sc.nextInt();
        }

        ArrayList<Integer> arrn = new ArrayList<>();
        while( n > 0 ){
            arrn.add( n % 10 );
            n /= 10;
        }
        System.out.println("입력한 정수의 자리수는 : " + arrn.size());


    }
}
