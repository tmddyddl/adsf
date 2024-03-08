package 인터페이스;

public class CarMain {
    public static void main(String[] args) {
        //최종실행 메소드
        Car sonata = new sonata();
        Car avante = new avante();

        System.out.println("===소나타===");
        sonata.start();
        sonata.stop();

        System.out.println("===아반떼===");
        avante.start();
        avante.stop();
    }
}
