package learning;

public class ThreadSleep extends Thread {
    public static void main(String args[]){

        ThreadSleep t1 = new ThreadSleep();
        t1.start();
        ThreadSleep t2 = new ThreadSleep();
        t2.start();

    }
    public void run() {
        for(int i=0;i<5;i++){
            try{
                Thread.sleep(500);
                System.out.println(i);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                System.out.println("exception");
            }
        }
    }


}
