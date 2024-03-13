package 해쉬맵;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//HashMap:순서를 보장하지않음 키와값으로구성
public class HashMapEx {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("우영우", 99);
        map.put("동그라미", 55);
        map.put("최수연", 95);
        map.put("이준호", 80);
        map.put("동그라미", 70); //키값이 같기때문에 나중에저장된값으로 대체
        System.out.println("총엔트리수 : " + map.size());
        System.out.println(map.get("동그라미"));//객체찾기
        //반복자 사용iterator
        Set<String> keyset = map.keySet(); //모든키를set객체에 담음
        Iterator<String> iterator = keyset.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Integer val = map.get(key);
            System.out.println(key + " "+ val);
        }

        for(String key : map.keySet()) {
            System.out.println(key+" "+ map.get(key));
        }

    }
}
