package DesignPatterns;

public class SingletonDesignPattern {

    static int x = 10;
    static SingletonDesignPattern singletonDesignPattern = null;
    private SingletonDesignPattern() {

    }
     public static SingletonDesignPattern getInstance() {
        if(singletonDesignPattern == null) {
            return new SingletonDesignPattern();
        }
        return singletonDesignPattern;
     }
}

class TestSingleton {
    public static void main(String[] args) {
        SingletonDesignPattern s1 = SingletonDesignPattern.getInstance();
        SingletonDesignPattern s2 = SingletonDesignPattern.getInstance();
        s1.x = s1.x+20;
        System.out.println(s1.x);
        System.out.println(s2.x);

    }
}
