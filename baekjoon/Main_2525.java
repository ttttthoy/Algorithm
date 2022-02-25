package baekjoon;
import java.util.Scanner;

public class Main_2525 {
    public static void main(String[] args){
        Scanner scc = new Scanner(System.in);

/*        int hour = scc.nextInt();
        int min = scc.nextInt();
        int min2 = scc.nextInt();

        if (hour >= 0 && hour <=23) {
            if (min >= 0 && min <= 59)
                min = min + min2;

                if (min >= 60){
                    hour++;
                    min = min - 60;
                }

        }
        System.out.println(hour +  " " + min);*/

        int hour = scc.nextInt();
        int minute = scc.nextInt() + scc.nextInt();

        while (minute > 59) {
            hour++; minute -= 60;
        } while (hour > 23)
            hour -= 24;
        System.out.printf("%d %d", hour, minute);


    }
}
