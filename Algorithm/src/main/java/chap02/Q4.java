package chap02;
import java.util.Scanner;

public class Q4 {
    static void copy(int[] a, int[] b){
        int num = a.length <= b.length ? a.length : b.length;

        for(int i = 0; i < num; i++)
            a[i] = b[i];
    }

    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);

        System.out.print("배열 a의 요솟수 : ");
        int na = sn.nextInt();

        int[] a = new int[na];

        for (int i = 0; i < na; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sn.nextInt();
        }

        System.out.print("배열 b의 요솟수 : ");
        int nb = sn.nextInt();

        int[] b = new int[nb];

        for (int i = 0; i < nb; i++) {
            System.out.print("b[" + i + "] = ");
            b[i] = sn.nextInt();
        }

        copy(a,b);

        System.out.println("복사 완료!!");
        for (int i = 0; i < na; i++)
            System.out.print("a[" + i + "]= " + a[i]);
    }
}
