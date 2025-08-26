package Day_7;

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Current thread name: " + Thread.currentThread().getName());
    }
}

public class ThreadNameExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
