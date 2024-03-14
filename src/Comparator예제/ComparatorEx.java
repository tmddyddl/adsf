package Comparator예제;

import java.util.Iterator;
import java.util.TreeSet;

//객체정을 위해서 사용, 두개의 객체를 받아서 정렬해줌
public class ComparatorEx {
    public static void main(String[] args) {
        TreeSet<Fruit> list = new TreeSet<>(new Decscending());
        list.add(new Fruit("grape", 3000));
        list.add(new Fruit("watermelon", 10000));
        list.add(new Fruit("strawberry", 6000));
        list.add(new Fruit("peach", 6000));
//        Iterator<Fruit> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            Fruit fruit = iterator.next();
//            System.out.println(fruit.name + " : " + fruit.price);
//        }
        for (Fruit e : list) System.out.println(e.name + " : " + e.price);
    }
}
