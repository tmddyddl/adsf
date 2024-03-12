package Arrays클래스;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
//배열을 다루기위한 다양한 메소드 포함
public class ArraysEx {
    public static void main(String[] args) {
        Integer[] arr = {5,3,4,7,8,9,2,1};
       // Arrays.sort(arr); //오름차순
        Arrays.sort(arr, Collections.reverseOrder());
        for(int e : arr) System.out.print(e + " ");
        System.out.println(Arrays.binarySearch(arr,5));
    }
}
