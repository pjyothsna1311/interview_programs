package Java8;

interface employee {
    void employeeDetails();
}

public class EmployeeMethodReference {
    String name;
    int age;

    EmployeeMethodReference(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void employeeDetails(){
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        EmployeeMethodReference e = new EmployeeMethodReference("jyo", 29);
        e.employeeDetails();

        //using lambda
        employee emp = () -> e.employeeDetails();
        emp.employeeDetails();

        //using method interface
        employee emp1 = e::employeeDetails;
        emp1.employeeDetails();
    }
}
