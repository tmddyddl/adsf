package 트리셋;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

// 컬렉션 프레임워크는 검색기능을 강화시킨 treeset과 treemap제공
public class Tree {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        String[] word = new String[n];
        sc.nextLine();
        for (int i = 0; i < word.length; i++) {
            word[i] = sc.nextLine();
        }
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(word));
        word = hashSet.toArray((new String[0]));
        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()==o2.length()) {
                    return o1.compareTo(o2);

                }else {
                    return o1.length() - o2.length();
                }

            }
        });
        System.out.println(word);
    }
}
