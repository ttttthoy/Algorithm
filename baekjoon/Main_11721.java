package baekjoon;

import java.util.Scanner;

public class Main_11721 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String mainTxt = sc.next();
        sc.close();

        for (int i = 0; i < mainTxt.length(); i++){
            System.out.print(mainTxt.charAt(i));
                if (mainTxt.length() > 10) {
                    if (i % 10 == 9)
                        System.out.println();
                }
        }
    }
}
