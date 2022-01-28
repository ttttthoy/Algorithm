package chap01;

import java.util.Scanner;

public class Q3 {
    //메소드사용 방법1
/*   static int min(int a, int b, int c, int d){
        int min = a;
        if(min > b) min = b;
        if(min > c) min = c;
        if(min > d) min = d;
        return min;
    }*/

    public static void main(String[] args) {

        //방법1
/*        System.out.println("min(34,5,77,1) =" + min(34,5,77,1));
        System.out.println("min(4,5,23,33) =" + min(4,5,23,33));
        System.out.println("min(12,88,6,96) =" + min(12,88,6,96));*/

        //scanner사용
        Scanner scc = new Scanner(System.in);

        System.out.println("최소값 start!");
        System.out.print("a 값은 =");
        int a = scc.nextInt();
        System.out.print("b 값은 =");
        int b = scc.nextInt();
        System.out.print("c 값은 =");
        int c = scc.nextInt();
        System.out.print("d 값은 =");
        int d = scc.nextInt();

        int min = a;
        if (min > b) min = b;
        if (min > c) min = c;
        if (min > d) min = d;
        System.out.println("최소값은 :" + min + "입니다.");
    }
}
