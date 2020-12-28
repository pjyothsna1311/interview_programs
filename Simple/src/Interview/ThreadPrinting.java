package Interview;

import Pack.A;

public class ThreadPrinting {
    StringBuffer sb = new StringBuffer("A");

    public static void main(String[] args) {
        ThreadPrinting t = new ThreadPrinting();
        AThread a = new AThread(t.sb);
        a.start();

        AThread a1 = new AThread(t.sb);
        a1.start();

        BThread b = new BThread(t.sb);
        b.start();
       /* CThread c = new CThread(t.sb);
        c.start();*/

    }
}

class AThread extends Thread {
    StringBuffer sb;
    AThread(StringBuffer sb) {
        this.sb = sb;
    }
    public void run() {
        synchronized (AThread.class) {
            for (int i = 0; i < 100; i++) {
                System.out.println(sb);
            }
            sb = sb.replace(0, 1, "B");
        }

    }





}
class BThread extends Thread {
    StringBuffer sb;
    BThread(StringBuffer sb) {
        this.sb = sb;
    }
    public void run() {
        for(int i= 0; i< 100; i++) {
            System.out.println(sb);
        }
    }
}
class CThread extends Thread {
    StringBuffer sb;
    CThread(StringBuffer sb) {
        this.sb = sb;
    }
    public void run() {
        for(int i= 0; i< 10; i++) {
            System.out.println(sb);
        }
    }
}
