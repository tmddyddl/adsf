package 어레이리스트;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//List 인터페이스: ArrayList, Vector, LinkedList의 부모인터페이스
//List의 특징은 배열과 비슷함 동적으로크기가 변한다.
//요소의 저장순서유지
//중복저장허용
//여러가지메소드 제공
public class ArrayListEx {
    public static void main(String[] args) {
        //asList() 배열을 List로 변환하기 위해사용
        String[] data = {"138,129,142"};
        List<String> pitches =new ArrayList<>(Arrays.asList(data));
        pitches.add(3,"133");
        System.out.println(pitches);
    }
}
