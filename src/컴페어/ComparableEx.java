package 컴페어;

import java.util.TreeSet;

//comparable,comparartor 인터페이스는 객체들을 정렬할때사용함
//comparable자기자신과 외부로부터 전달된 객체를 비교
//컴페어레이터는 두개의 객체를 전달받아 비교
public class ComparableEx {
    public static void main(String[] args) {
        TreeSet<Carcom> list = new TreeSet<>();
        list.add(new Carcom("santafe", 2016,"white"));
        list.add(new Carcom("sorento",2012,"silver"));
        list.add(new Carcom("grandeur", 2018,"black"));
        list.add(new Carcom("morning", 2012,"orange"));
        list.add(new Carcom("morning", 2012,"yellow"));

        for(Carcom e :list) {
            System.out.println(e.modelName + ":" +e.modelyear+e.color);
        }
    }
}
