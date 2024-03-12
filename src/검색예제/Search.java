package 검색예제;

import java.util.Arrays;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("배열갯수입력");
        int num = sc.nextInt();

        int [] arr = new int[num];
        System.out.print("찾을수:");
        int key = sc.nextInt();
        for(int i = 0; i< arr.length; i++) {
            arr[i] = (int)((Math.random()*num))+1;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, key));
    }
}
