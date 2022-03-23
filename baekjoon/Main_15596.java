package baekjoon;

public class Main_15596 {

    //함수만 구현
    long sum(int[] a) {
        long sum = 0;

        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        return sum;
    }
}
