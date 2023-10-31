package Ex1;

import java.io.IOException;

public class TestThread {
    public static void main(String[] args) throws IOException {
        Thread thread1 = new Thread(new MyThread1("Task_A"),"T1");
        Thread thread2 = new Thread(new MyThread1("Task_B"),"T2");
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        System.out.println(thread1.getName() + " Priority: " + thread1.getPriority());
        System.out.println(thread2.getName() + " Priority: " + thread2.getPriority());
        thread1.start();
        thread2.start();
    }
}
