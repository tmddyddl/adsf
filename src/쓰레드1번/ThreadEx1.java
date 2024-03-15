package 쓰레드1번;
//쓰레드: 동시에 여러가지 일을 병렬적으로 수행하는 것
//쓰레드를 만드는 방법은 Thread클래스를 상속받는방법
//Runnable인터페이스를 상속받는방법
//
public class ThreadEx1 {
    public static void main(String[] args) {
        Thread thread1 =new Custom();
        thread1.start();
        System.out.println("main Thread...........");

        Thread thread2 =new Custom();
        thread2.start();
    }
}
class Custom extends Thread {
    @Override
    public void run() {
        int sum = 0;
        for( int i = 0; i<= 10; i++) {
            sum += i;
            System.out.println(sum);
        }
        System.out.println(Thread.currentThread() + "합 : " + sum);
    }
}

class Sample implements Runnable {
    @Override
    public void run() {

    }
}


