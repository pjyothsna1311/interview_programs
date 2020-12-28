package Interview;

public class PrintEvenOddUsingThreads {
    public static void main(String[] args) {
        PrintEvenOdd p = new PrintEvenOdd();
        p.odd = true;
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();
        evenThread.start();
        oddThread.start();
        try {
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class EvenThread extends Thread{
    PrintEvenOdd p = new PrintEvenOdd();
    public void run() {
        p.printEven();
    }

}

class OddThread extends Thread {
    PrintEvenOdd p = new PrintEvenOdd();
    public void run() {
        p.printOdd();
    }
}

class PrintEvenOdd {
    boolean odd;
    int max = 10;
    int count = 1;
    public void printEven() {
        synchronized (this) {
            while(count<max) {
                System.out.println("checking odd loop");
                while (!odd) {
                    try {
                        System.out.println("Odd waiting : " + count);
                        wait();
                        System.out.println("Notified odd :" + count);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                System.out.println("Odd Thread :" + count);
                count++;
                odd = false;
                notify();
            }
        }

    }
    public void printOdd() {
        synchronized (this){
            while(count<max) {
                System.out.println("checking even loop ");
                while(odd) {
                    try{
                        System.out.println("Even waiting: " + count);
                        wait();
                        System.out.println("Notified even:" + count);
                    }catch (InterruptedException e){
                        System.out.println(e);
                    }
                }
                System.out.println("Even thread :" + count);
                count++;
                odd = true;
                notify();

            }
        }
    }
}
