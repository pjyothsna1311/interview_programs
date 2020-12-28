package learning;

public class Aggregration {

    public static void main(String args[]) {
        Address a= new Address();
        Employee e = new Employee(100,a);
        e.display();
    }
}

class Employee {

    int id;
    Address address;
    Employee(int id,Address address){
        this.id=id;
        this.address= address;
    }
    void display() {
        System.out.println(address.country);
    }


}
class Address {
    String country;
    String street;
}
