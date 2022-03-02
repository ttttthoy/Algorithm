package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main_10818 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] array = new int[n];

            for(int i = 0; i < n; i++) {
                array[i] = Integer.parseInt(st.nextToken());
            }

        int min = array[0];
        int max = array[0];

        for(int i = 1; i < n; i++) {

            if(min > array[i]) {
                min = array[i];
            } if(max < array[i]) {
                max = array[i];
            }
        }

        System.out.print(min + " " + max);
    }
}

