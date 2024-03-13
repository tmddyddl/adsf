package 커피메뉴만들기;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//해시맵을 이용한 커피메뉴만들기
public class CoffeeMenuMain {
    static Map<String, MenuInfo> map = new HashMap<>();

    public static void main(String[] args) {
        makeMenu();
        selectMenu();
    }

    //초기메뉴 추가하기
    static void makeMenu() {
        map.put("아메리카노", new MenuInfo("아메리카노", "2000원", "coffee", "normalcoffee"));
        map.put("espresso", new MenuInfo("espresso", "2200원", "coffee", "deepcoffee"));
        map.put("latte", new MenuInfo("latte", "4000원", "coffee", "milk"));

    }

    static void selectMenu() {
        Scanner sc = new Scanner(System.in);
        String key;
        while (true) {
            System.out.println("choice Menu");
            System.out.println("1.보기 2.조회 3.추가 4.삭제 5.수정 6.종료 : ");
            int sellMenu = sc.nextInt();
            switch (sellMenu) {
                case 1:
                    System.out.println("=======Menu=======");
                    for (String e : map.keySet()) {
                        System.out.println("Menu : " + map.get(e).name);
                        System.out.println("price : " + map.get(e).price);
                        System.out.println("category : " + map.get(e).category);
                        System.out.println("desc : " + map.get(e).desc);
                        System.out.println("-------------------------------");
                    }
                    break;
                case 2:
                    System.out.println("check Menu");
                    key = sc.next();
                    if (map.containsKey(key)) {
                        System.out.println("Menu : " + map.get(key).name);
                        System.out.println("price : " + map.get(key).price);
                        System.out.println("category : " + map.get(key).category);
                        System.out.println("desc : " + map.get(key).desc);
                    } else System.out.println("disable");
                    break;
                case 3:
                    System.out.println("add Menu");
                    key = sc.next();
                    if (map.containsKey(key)) {
                        System.out.println("this Menu is already");
                    } else {
                        System.out.println("input price");
                        String price = sc.next();
                        System.out.println("input category : ");
                        String cate = sc.next();
                        System.out.print("input Info:");
                        String desc = sc.nextLine();
                        sc.nextLine();
                        map.put(key, new MenuInfo(key, price, cate, desc));
                    }
                    break;
                case 4:
                    System.out.println("Input delete Menu : ");
                    key = sc.next();
                    if (map.containsKey(key)) {
                        map.remove(key);
                        System.out.println("delete Menu");
                    } else {
                        System.out.println("no menu to delete");
                    }
                    break;
                case 5:
                    System.out.println("input edit Menu:");
                    key = sc.next();
                    if (map.containsKey(key)) {
                        System.out.print("input price : ");
                        String price = sc.nextLine();
                        System.out.println("input category : ");
                        String cate = sc.nextLine();
                        sc.nextLine();
                        System.out.print("input Info:");
                        String desc = sc.nextLine();
                        map.replace(key, new MenuInfo(key, price, cate, desc));
                    } else {
                        System.out.println("no menu to edit");
                    }
                    break;

                case 6:
                    System.out.println("exit Menu");
                    return;
            }
        }
    }
}
