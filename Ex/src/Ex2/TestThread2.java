package Ex2;

public class TestThread2 {
    public static void main(String[] args) throws InterruptedException {
        Runnable myThread2 = new MyThread2();
        Thread thread = new Thread(myThread2);
        Thread thread1 = new Thread(myThread2);
        thread.start();
        thread.join();
        thread1.start();
    }
}
