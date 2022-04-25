package baekjoon;
import java.util.Scanner;

public class Main_1924 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
        int a = sc.nextInt();
        int day = sc.nextInt();
        String[] dyweek = new String[]{"MON","TUE","WED","THU","FRI","SAT","SUN"};
        int diff = 0;

        for (int i = 0; i < a; i++){
            diff += months[i];
        }
        diff += day - 1;
        System.out.print(dyweek[diff%7]);
    }
}
