package learning;

import Interview.Singleton;

public class SingletonClass {

    static SingletonClass instance = null;
    int x = 10;
    private SingletonClass () {

    }

    public static SingletonClass getInstance() {
        if(instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }
}

class TestSingleton {

    public static void main(String[] args) {

        SingletonClass a = SingletonClass.getInstance();
        a.x = a.x +10;
        System.out.println(a.x);
        SingletonClass b = SingletonClass.getInstance();

        // Since a and b refer to the same obj value of b is also same as a.
        System.out.println(b.x);
    }
}
