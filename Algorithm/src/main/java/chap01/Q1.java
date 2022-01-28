package chap01;
import java.util.Scanner;

public class Q1 {
    //방법1
/*    static int max4(int a, int b, int c, int d){
        int max = a;
        if (max < b) max = b;
        if (max < c) max = c;
        if (max < d) max = d;

        return max;
    }*/

    public static void main(String[] args){
        //방법1
/*        System.out.println("max(34,44,23,234)= " + max4(34,44,23,234));
        System.out.println("max(65,21,19,98)= " + max4(65,21,19,98));
        System.out.println("max(8,45,61,23)= " + max4(8,45,61,23));
        System.out.println("max(3,44,88,12)= " + max4(3,44,88,12));*/

        //방법2
        Scanner sc = new Scanner(System.in);

        System.out.println("최대값 start!");
        System.out.print("a의 값은 = "); int a = sc.nextInt();
        System.out.print("b의 값은 = "); int b = sc.nextInt();
        System.out.print("c의 값은 = "); int c = sc.nextInt();

        int max = a;
        if(max < b) max = b;
        if(max < c) max = c;

        System.out.println("최대값은 " + max + "입니다");

    }
}
