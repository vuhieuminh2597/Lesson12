package Ex1;

public class MyThread1 implements Runnable {
    private String nameThread;

    public MyThread1(String nameThread) {
        this.nameThread = nameThread;
    }


    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(this.nameThread + ": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        return "MyThread1{" +
                "nameThread='" + nameThread + '\'' +
                '}';
    }
}
