package learning;

public class ToStringDemo {
    int id;
    String name;

    //if we override tostring method then obj wil be printed propertly. Else it returns the hashcode
    public String toString(){
        return name;
    }

    public static void main(String args[]) {
        ToStringDemo toStringDemo = new ToStringDemo();
        System.out.println(toStringDemo);
    }
}
