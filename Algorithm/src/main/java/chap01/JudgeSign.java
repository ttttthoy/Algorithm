package chap01;

import java.util.Scanner;

public class JudgeSign {
    public static void main(String[] args){
        Scanner std = new Scanner(System.in);

        System.out.println("정수를 입력하세요");
        int n = std.nextInt();

        if (n > 0)
            System.out.println("이 수는 양수");
        else if (n < 0)
            System.out.println("이 수는 음수");
        else
            System.out.println("이 수는 0임");
    }
}
