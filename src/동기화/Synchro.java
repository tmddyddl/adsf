package 동기화;
//동기화Synchronized: 여러개의 쓰레드가 동시에 같은자원을 접근하는 락을걸어
//다른쓰레드의 진입을 막는것
public class Synchro {
    public static void main(String[] args) {
        ShareThread shareThread = new ShareThread();
        Thread thread1 = new Thread(()->{
            shareThread.setValue(100);
        });
        Thread thread2 = new Thread(()->{
            shareThread.setValue(10);
        });
        thread1.setName("쓰레드 1");
        thread2.setName("쓰레드 2");
        thread1.start();
        thread2.start();

    }
}
class ShareThread {
    private int value = 0;
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value =value;
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+
                "의 밸류값은"+this.value);
    }



}
