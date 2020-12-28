package learning;

public class ObjectInitialization {

    public static void main(String args[]) {
        Student s1 = new Student();

        //initialization through reference variable
        s1.id =100;
        s1.name ="jyo" ;
        System.out.println(s1.id + "" + s1.name);

        //through method
        s1.initialize(200,"phani");
        s1.display();
    }
}

class Student {
    int id;
    String name;

    Student() {

    }

    void initialize(int id, String name) {
        this.id=id;
        this.name=name;
    }
    void display(){
        System.out.print(id);
    }

}
