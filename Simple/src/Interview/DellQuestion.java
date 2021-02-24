package Interview;

public class DellQuestion {
    public static void main(String[] args) {
        AA aa = new BB();

        //aa.run();

    }
}

class AA{

}

class BB extends AA {

    public void run() {
        System.out.println("B method");
    }
}
