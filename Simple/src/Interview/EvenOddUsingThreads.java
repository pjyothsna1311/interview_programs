package Interview;

public class EvenOddUsingThreads {

    int counter = 1;
    int max = 10;
    public void printEven(){
        synchronized (this) {
            while (counter<max){
                while (counter%2 == 1) {
                    try{
                        wait();
                    } catch (Exception e) {
                        System.out.println("even excep");
                    }
                }
                System.out.println(counter);
                counter++;
                notify();
            }
        }

    }
    public void printOdd() {
        synchronized (this) {
            while (counter<max){
                while (counter%2 == 0){
                    try{
                        wait();
                    } catch (Exception e) {
                        System.out.println("odd excep");
                    }
                }
                System.out.println(counter);
                counter++;
                notify();

            }
        }
    }

    public static void main(String[] args) {
        EvenOddUsingThreads e = new EvenOddUsingThreads();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                e.printEven();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                e.printOdd();
            }
        });
        t1.start();
        t2.start();
    }
}

