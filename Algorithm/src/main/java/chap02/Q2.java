package chap02;
import java.util.Scanner;

public class Q2 {
    static void swap2(int[] a, int idx1, int idx2){
        int g = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = g;
    }

    static void loopg(int[] a){

        show(a);
        for (int i = 0; i < a.length /2; i++) {
            System.out.println("a[" + i + "]와 a[" + (a.length - i - 1) + "]를 교환합니다.");
            swap2(a, i, a.length - i - 1);
            show(a);
        }

    }

    static void show(int[] a){
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
            System.out.println();
    }

    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num2 = stdin.nextInt();

        int[] arr = new int[num2];

        for (int i = 0; i < arr.length; i++){
            System.out.print("arr[" + i + "] = ");
            arr[i] = stdin.nextInt();
        }

        loopg(arr);

        System.out.print("역순 정렬을 마쳤습니다.");
    }
}
