package 어레이리스트메뉴;

import java.util.ArrayList;
import java.util.List;

class MenuInfo {
    String name = "";
    int price;
    String category = "";
    String desc = "";
    boolean isTax;
    MenuInfo(String name, int price, boolean isTax) {
        this.name = name;
        this.price = price;
        this.isTax = isTax;
    }
    public String getJsonFormat() {
        return "{"+"\"name\":"+name+","+"\"price\":"+price+","+"\"isTax\":"+isTax+"}";
    }
}

public class ArrayListMenu {
    public static void main(String[] args) {
        ArrayList<MenuInfo> menuList = new ArrayList<>();
        menuList.add(new MenuInfo("Americano", 2000, true));
        menuList.add(new MenuInfo("Latte", 4000, true));
        menuList.add(new MenuInfo("Espresso", 2500, true));

        for(int i = 0; i < menuList.size(); i++) {
            System.out.println(menuList.get(i).getJsonFormat());
        }
    }
}