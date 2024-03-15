package 예외3번;



public class Excep3 {
    public static void main(String[] args) {
        Test test = null;
        try {

            String testStr = test.name;
            System.out.println(test);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException발생");
        }
    }

    class Test {
        String name = "rhaehfdl";
    }
}