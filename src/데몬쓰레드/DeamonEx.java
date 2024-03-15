package 데몬쓰레드;

//데몬쓰레드 : 다른쓰레드의 작업을 돕는 보조족인 역할을 수행
//다른쓰레드가 모두 종료되면 데몬쓰레드는 강제종료됨
public class DeamonEx {
    public static void main(String[] args) throws InterruptedException {
        AutoSave autoSave = new AutoSave();
        autoSave.setDaemon(true); //데몬쓰레드설정
        autoSave.start();
        Thread.sleep(30000);

    }
}

class AutoSave extends Thread {
    public void save() {
        System.out.println("save file");
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
                save();
            }
        }
    }
