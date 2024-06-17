class MyThread implements Runnable {
    public void run() {
        System.out.println("child thread");
    }
}

public class multithread1 {
    public static void main(String[] args) {
        System.out.println("main thread");
        MyThread t = new MyThread();
        Thread th = new Thread();
        th.start();
    }
}
