package chap02;
import java.util.Scanner;

public class CardConvRev {

    static int cardConvR(int x, int r, char[] d){
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRXTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        } while (x != 0);

        return digits;
    }

    public static void main(String[] args){
        Scanner snn = new Scanner(System.in);
        int no;
        int cd;
        int dno;
        int retry;
        char[] cno = new char[2];

        System.out.println("10진수를 기수 변환합니다.");
        do {
            do{
                System.out.print("변환하는 음이 아닌 정수 : ");
                no = snn.nextInt();
            } while (no < 0);

            do{
                System.out.print("어떤 진수로 변환할까요? (2~36) : ");
                cd = snn.nextInt();
            } while (cd < 2 || cd > 36);
            dno = cardConvR(no, cd, cno);

            System.out.print( cd +  "진수로는 ");
            for (int i = dno -1 ; i >= 0; i--)
                System.out.print(cno[i]);
            System.out.println("입니다.");

            System.out.print("한 번 더 할까요? (1.예/0.아니오) : ");
            retry = snn.nextInt();
        } while (retry == 1);
    }
}
