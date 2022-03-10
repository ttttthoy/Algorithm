package baekjoon;
import java.util.Scanner;
import java.util.Arrays;

public class Main_8958 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arraySize = scan.nextInt();

        String[] arr = new String[arraySize];

        for(int i=0; i<arraySize; i++) {
            arr[i] = scan.next();
        } for(int i =0; i<arraySize; i++) {
            char[] arr2 = arr[i].toCharArray();
            int score = 0; int plus = 1;

            for(int k =0; k < arr2.length; k++){
                if(arr2[k] == 'O'){
                    score += plus; plus++;
                } else{plus = 1;}
            }
            System.out.println(score);
        }
    }
}



