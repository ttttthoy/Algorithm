package baekjoon;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main_2577 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int result = A * B * C;

        int[] number = new int[10];

        while(result > 0) {
            number[result%10]++;
            result/=10;
        }

        for(int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }

        //BufferedReader
/*        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(buff.readLine());
        int B = Integer.parseInt(buff.readLine());
        int C = Integer.parseInt(buff.readLine());
        int result = A * B * C;

        String str = Integer.toString(result);
        int count = 0;
        for (int i = 0; i<10; i++){
            for (int k = 0; k<str.length(); k++){
                if (str.charAt(k) - '0' == i)
                    count++;

            }
            System.out.println(count);
            count = 0;
        }*/
    }
}
