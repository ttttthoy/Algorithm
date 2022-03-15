package chap03;
import java.util.Scanner;

public class Q2{

    static int seqSearchEx(int[] a, int n, int key) {
        System.out.print("   |");

        for (int k = 0; k < n; k++)
            System.out.printf("%4d", k);

        System.out.println();

        System.out.print("---+");

        for (int k = 0; k < 4 * n + 2; k++)
            System.out.print("-");

        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print("   |");
            System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
            System.out.printf("%3d|", i);

            for (int k = 0; k < n; k++)
                System.out.printf("%4d", a[k]);
            System.out.println("\n   |");

            if (a[i] == key)
                return i;
        }
        return -1;
    }

}

