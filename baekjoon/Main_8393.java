package baekjoon;

import java.util.Scanner;

public class Main_8393 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int ina = sc.nextInt();

        int sum = 0;

        for (int i = 0; i<ina; i++){
            sum += (i+1) ;
        }
        System.out.println(sum);
    }
}
