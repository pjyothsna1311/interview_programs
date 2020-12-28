package learning;

public class ThreadDemo implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        Thread t1 = new Thread(threadDemo);
        t1.start();
        t1.start();

    }


}
