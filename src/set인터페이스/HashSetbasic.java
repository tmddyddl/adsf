package set인터페이스;

import java.util.Arrays;
import java.util.HashSet;

//setinterface : 중복을 허용하지 않음
//hashset클래스:순서를 유지하지않음 중복허용하지않음 집합의개념
public class HashSetbasic {
    public static void main(String[] args) {
        //       String[] data = {"h","e","l","l","o"};
        //       HashSet<String> set= new HashSet<>(Arrays.asList(data));
        //       HashSet<String> set= new HashSet<>(Arrays.asList(data));
        //      System.out.println(set);
        HashSet<String> set = new HashSet<>();
        set.add("java");
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        for(String e: set) System.out.println(e +" ");
    }
}

