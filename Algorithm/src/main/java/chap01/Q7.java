package chap01;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);

        System.out.println("1부터 7까지의 합을 구합니다");
        System.out.print("n의 값 : ");
        int n = sn.nextInt();

        int sum = 0;
        for(int i = 1; i <= n; i++)
            sum += i;

        System.out.println("1+2+3+4+5+6+7= " + sum);
    }
}
