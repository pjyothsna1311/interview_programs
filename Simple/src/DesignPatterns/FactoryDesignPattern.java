package DesignPatterns;

//Creational Design Pattern
public interface FactoryDesignPattern {
    public void os_spec();
}

class FactoryMain {
    public static void main(String[] args) {
        OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();
        FactoryDesignPattern os = operatingSystemFactory.getInstance("Windows");
        os.os_spec();
        //operatingSystemFactory.getInstance("Windows");
    }
}

class Android implements FactoryDesignPattern {
    public void os_spec() {
        System.out.println("Android OS");
    }
}

class IOS implements FactoryDesignPattern {
    public void os_spec() {
        System.out.println("IOS");
    }
}

class Windows implements FactoryDesignPattern {
    public void os_spec() {
        System.out.println("Windows OS");
    }
}
//To get obj
class OperatingSystemFactory {

    public FactoryDesignPattern getInstance(String str) {
        if(str.equals("Android"))
            return new Android();
        else if(str.equals("IOS"))
            return new IOS();
        else
            return new Windows();

    }
}


