package x보다작은수;

import java.sql.SQLOutput;
import java.util.Scanner;

public class xxx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            r[i] = sc.nextInt();
            if (r[i] < s) System.out.print(r[i] + " ");
        }
        System.out.println();
    }
}
