package learning;

public class ThreadLex extends Thread {

    public void run(){
        System.out.println("Thread is running");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("sleep");
        ThreadLex threadLex = new ThreadLex();
        threadLex.setPriority(15);
        threadLex.start();


    }


}
