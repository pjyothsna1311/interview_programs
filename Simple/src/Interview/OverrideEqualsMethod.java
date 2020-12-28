package Interview;

public class OverrideEqualsMethod {

    String name;
    int age;
    AnotherClass anotherClass;

    OverrideEqualsMethod(String name,int age,AnotherClass anotherClass) {
        this.name = name;
        this.age = age;
        this.anotherClass = anotherClass;
    }

    public static void main(String[] args) {
        OverrideEqualsMethod o1 = new OverrideEqualsMethod("jyo",29, new AnotherClass("jyo", 29));
        OverrideEqualsMethod o2 = new OverrideEqualsMethod("jyo", 29,new AnotherClass("jyo", 29));
        //If we dont override equals method then their references will be compared.
        System.out.println(o1.equals(o2));
        System.out.println(o1 == o2);
    }

    public boolean equals(Object o) {
        if(o == this){
            return true;
        }
        if(!(o instanceof OverrideEqualsMethod)) {
            return false;
        }
        OverrideEqualsMethod o1 = (OverrideEqualsMethod)o;
        return name.equals(o1.name) && Integer.compare(age,o1.age) == 0 && anotherClass.equals(o1.anotherClass);
    }

}

class AnotherClass {
    String name;
    int age;

    AnotherClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object o) {
        if(o == this){
            return true;
        }
        if(!(o instanceof AnotherClass)) {
            return false;
        }
        AnotherClass o1 = (AnotherClass) o;
        return name.equals(o1.name) && Integer.compare(age,o1.age) == 0;
    }

}
