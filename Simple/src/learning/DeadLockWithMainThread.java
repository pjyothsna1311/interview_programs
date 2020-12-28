package learning;

public class DeadLockWithMainThread {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("entering into deadloack");

        //calling join on main thread will tell the main thread to wait for itself, which will never complete so enters into deadlock
        Thread.currentThread().join();
        System.out.println("it will never exit deadlock");

    }
}

