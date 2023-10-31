package Ex2;

public class MyThread2 implements Runnable {
    private int count;


    @Override
    public void run() {
        this.count++;
        if (this.count == 1) {
            evenNumber();
        } else if (this.count == 2) {
            oddNumber();
        }
    }

    private static void evenNumber() {
        System.out.println("Thread even:");
        for (int i = 2; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "");
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void oddNumber() {
        System.out.println("Thread odd:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i + "");
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
