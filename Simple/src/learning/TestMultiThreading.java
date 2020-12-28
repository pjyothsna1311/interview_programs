package learning;

public class TestMultiThreading {
    public static void main(String[] args) {
        TestSyncThread t1 = new TestSyncThread();
        TestUnSyncThread t2 = new TestUnSyncThread();
        t1.start();
        t2.start();
    }
}
 class SyncDigicert {

     synchronized  void m1(){
        System.out.println("calling m1" + Thread.currentThread().getName());
         try {
             Thread.sleep(30000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         System.out.println("Finished m1" + Thread.currentThread().getName());
    }


}

class TestSyncThread extends Thread {
    SyncDigicert s1 = new SyncDigicert();

    public void run() {
        System.out.println("Calling M1 in Sync thread");
        s1.m1();
        //SyncDigicert.m1();
    }

}

class TestUnSyncThread extends Thread {
    SyncDigicert s1 = new SyncDigicert();


    public void run() {
        System.out.println("Calling M1 in UnSync thread");
        s1.m1();
        //SyncDigicert.m1();
    }

}
