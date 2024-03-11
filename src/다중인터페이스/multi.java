package 다중인터페이스;

public class multi {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Buy buyer = customer;
        buyer.buy();
        buyer.order();//재정의된 메소드 호출

        Sell seller = customer;
        seller.sell();
        seller.order();

        Customer customer1 = (Customer) seller;
        customer1.buy();
        customer1.sell();
        customer1.order();
    }
}

interface Sell {
    void sell();

    default void order() {
        System.out.println("판매주문");
    }
}

interface Buy {
    void buy();

    default void order() {
        System.out.println("구매주문");
    }
}

class Customer implements Buy, Sell {

    @Override
    public void sell() {
        System.out.println("판매하기");
    }

    @Override
    public void buy() {
        System.out.println("구매하기");
    }

    @Override
    public void order() {
        System.out.println("주문하기");
    }
}