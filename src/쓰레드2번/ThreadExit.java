package 쓰레드2번;

//쓰레드를 종료하는 방법
public class ThreadExit {
    public static void main(String[] args) throws InterruptedException {
//        RunThread runThread = new RunThread();
//        runThread.start();
//        Thread.sleep(1000);
//        runThread.setStop(true);
        InterruptThread interruptThread = new InterruptThread();
        interruptThread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
        interruptThread.interrupt();
    }
}

    class RunThread extends Thread {
        private boolean stop; // stop플래그 설정

        public void setStop(boolean stop) {
            this.stop = stop;
        }

        @Override
        public void run() {
            while (!stop) {
                System.out.println("Thread 실행중");
            }
            System.out.println("자원 정리 중");
            System.out.println("실행 종료");
        }
    }

    class InterruptThread extends Thread {
        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("Thread실행중");
                    Thread.sleep(1);
                }
            } catch (InterruptedException e) {
                System.out.println("인터럽트발생");
            }
            System.out.println("ddd");
            System.out.println("asdf");
        }
    }
