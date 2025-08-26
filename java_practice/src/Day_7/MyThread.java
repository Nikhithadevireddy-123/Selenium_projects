package Day_7;

class MyThread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

public class MyThread {
    public static void main(String[] args) {
        MyThread1 thread = new MyThread1();
        thread.start();
    }
}