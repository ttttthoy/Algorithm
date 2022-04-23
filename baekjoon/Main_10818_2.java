package baekjoon;

import java.util.Scanner;

public class Main_10818_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int num;
        int min = sc.nextInt();
        int max = min;

        for (int i = 0; i < size; i++){
            num = sc.nextInt();
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        System.out.printf("%d %d", min, max);
    }
}
