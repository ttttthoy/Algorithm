package chap02;
import java.util.Scanner;

public class Q3 {
    static int sumof(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++)
             sum += a[i];
        return sum;
    }

    public static void main(String[] args){
        Scanner nn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int d = nn.nextInt();

        int[] arr = new int[d];

        for (int i = 0; i < arr.length; i++){
            System.out.print("a[" + i + "] = ");
            arr[i] = nn.nextInt();
        }

        System.out.println("모든 요소의 합계는 : " + sumof(arr) + "입니다.");
    }
}
