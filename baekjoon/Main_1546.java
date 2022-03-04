package baekjoon;
import java.util.Scanner;

public class Main_1546 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int arr[] = new int[A];

        int max = 0;
        int total = 0;
        double avg = 0.0;
        for (int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();

            if (arr[i] > max)
                max = arr[i];
            total += arr[i];

        }

        System.out.println(max);
        scan.close();

        avg = 100.0 * total /max / A;
        System.out.println(avg);

    }
}
