package learning;

public class SynchronizationDemo {



    public static void main(String[] args) {
        SynchronizationDemo s = new SynchronizationDemo();
        SyncDemo s1 = new SyncDemo(s);
        Thread t1 = new Thread(new syncDemo11(s));
        s1.start();
        t1.start();
        System.out.println(true||false);


    }

    synchronized  void printTable(int n){
        for(int i= 1;i<=5;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }catch(Exception e){System.out.println(e);}
        }
    }
    }


class SyncDemo extends Thread{
    SynchronizationDemo s = new SynchronizationDemo();
    SyncDemo(SynchronizationDemo s){
        this.s = s;
    }
    public void run() {
        s.printTable(5);
    }
}

class syncDemo11 implements Runnable{

    SynchronizationDemo s = new SynchronizationDemo();
    syncDemo11(SynchronizationDemo s) {
        this.s = s;
    }
    @Override
    public void run() {
        s.printTable(100);
    }
}
