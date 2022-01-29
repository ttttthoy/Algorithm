package chap01;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);

        int i = 1;

        System.out.println("가우스덧셈으로 합을 출력하세요!");
        System.out.print("n의 값은: ");
        int n = sn.nextInt();

        int sum = (i + n) * (n / 2);
        if ((n % 2) != 0)
            sum += ((n / 2) + 1);

        System.out.println("1부터 n까지의 합은 : " + sum);
    }
}
