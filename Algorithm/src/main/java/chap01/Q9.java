package chap01;

import java.util.Scanner;

public class Q9 {

    static int sumof(int a, int b){

        int sum = 0;
        while( a <= b) {
            sum += a;
            a++;
        }

        return sum;
    }

    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);

        System.out.print("a는 : ");
        int a = sn.nextInt();
        System.out.print("b는 : ");
        int b = sn.nextInt();

        sumof(a,b);

        System.out.println(a + " 부터 " + b + " 까지의 합은 " + sumof(a,b) + "입니다." );
    }
}
