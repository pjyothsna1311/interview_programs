package Java8;

import java.util.ArrayList;
import java.util.List;

public class StreamsLex {

    public int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public double getYearsInOrg() {
        return yearsInOrg;
    }

    public void setYearsInOrg(double yearsInOrg) {
        this.yearsInOrg = yearsInOrg;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String name;
    private int sal;
    private double yearsInOrg;
    private String role;
    private String gender;

    public StreamsLex(String name, int id, int sal, double years, String role, String gender) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.yearsInOrg = years;
        this.role = role;
        this.gender = gender;
    }

    public static void main(String[] args) {

        long count = 0;
        List<StreamsLex> emplist = new ArrayList<>();
        emplist.add(new StreamsLex("jyothsna",1,25000,5,"TA","F"));
        emplist.add(new StreamsLex("ravi",2,175000,10,"Architect","M"));
        emplist.add(new StreamsLex("papai",2,25000,1,"SSE","F"));

        emplist.stream().filter(e -> e.getRole() == "TA").forEach(e -> System.out.println(e.role + "  " + e.name));
        count = emplist.stream().filter(e -> e.getGender().matches("F")).count();
        System.out.println(count);

    }
}
