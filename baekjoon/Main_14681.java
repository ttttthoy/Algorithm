package baekjoon;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_14681 {
    public static void main(String[] args) throws IOException{
        //scanner 이용한코드
/*        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a > 0 && b > 0) {
           if (a <= 1000 && b <= 1000)
               System.out.println("1");
        } if (a < 0 && b > 0) {
            if (a >= -1000 && b <= 1000)
                System.out.println("2");
        } if (a < 0 && b < 0) {
            if (a >= -1000 && b >= -1000)
                System.out.println("3");
        } if (a > 0 && b < 0) {
            if (a <= 1000 && b >= -1000)
                System.out.println("4");
        }*/

        //BufferedReader 사용코드
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(buff.readLine());
        int b = Integer.parseInt(buff.readLine());

        if(a > 0) {
            if(b > 0) {
                System.out.print(1);
            }
            else {
                System.out.print(4);
            }
        }

        else {
            if(b > 0) {
                System.out.print(2);
            }
            else {
                System.out.print(3);
            }
        }

    }
}
