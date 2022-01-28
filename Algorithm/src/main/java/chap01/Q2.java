package chap01;

import java.util.Scanner;

public class Q2 {
    //방법1
/*    static int min(int a, int b, int c){
        int min = a;
        if(min > b) min = b;
        if(min > c) min = c;
        return min;
    }*/

    public static void main(String[] args){

        //방법1
/*        System.out.println("min(34,5,77) =" + min(34,5,77));
        System.out.println("min(4,5,23) =" + min(4,5,23));
        System.out.println("min(12,88,6) =" + min(12,88,6));*/

        //scanner사용
        Scanner scc = new Scanner(System.in);

        System.out.println("최소값 start!");
        System.out.print("a 값은 ="); int a = scc.nextInt();
        System.out.print("b 값은 ="); int b = scc.nextInt();
        System.out.print("c 값은 ="); int c = scc.nextInt();

        int min = a;
        if(min > b) min = b;
        if(min > c) min = c;
        System.out.println("최소값은 :" + min + "입니다.");
    }

}
