package chap03;
import java.util.Scanner;

public class SeqSearch {

    static int seqSearch(int[] a, int n, int key){
        int i = 0;

        while (true){
            if (i == n)
                return -1;  //검색실패
            if (a[i] == key)
                return i;   //검색성공 인덱스반환
            i++;
        }
    }

    //for문으로 구성하면
/*    static int seqSearch(int[] a, int n , int key){
        for (int i = 0; i < n; i++)
            if (a[i] == key)
                return i;
        return -1;
    }*/

    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = sn.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++){
            System.out.print("x[" + i + "] : ");
            x[i] = sn.nextInt();
        }

        System.out.print("검색할 값 : ");
        int ky = sn.nextInt();
        int idx = seqSearch(x, num, ky);

        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(ky + "는 x[" + idx + "]에 있습니다.");

    }
}
