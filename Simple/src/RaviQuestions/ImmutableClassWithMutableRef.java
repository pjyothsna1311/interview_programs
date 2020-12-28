package RaviQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public final class ImmutableClassWithMutableRef {

    private final int id;
    private final String name;
    private final City city;
    private List<Integer> list;
    private Date date;

    ImmutableClassWithMutableRef(int id, String name, City city,List<Integer> list,Date date){
        this.id = id;
        this.name = name;
        this.city = city;
        this.list = Collections.unmodifiableList(list);
        //this.list = new ArrayList<>();
        //Collections.copy(this.list, list);
        this.date = (Date)date.clone();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public City getCity() throws CloneNotSupportedException {
        return (City)city.clone();
    }
    public List<Integer> getList() {
        return Collections.unmodifiableList(list);
    }
    public Date getDate() {
        return date;
    }

    public String toString() {
        return id + "  " + name + "   " + city.getCname() + "   " + city.getZipcode() +"  " + list + "  " + date.getYear();
    }
}

class City implements  Cloneable {
    String cname;
    String zipcode;

    City(String cname, String zipcode) {
        this.cname = cname;
        this.zipcode = zipcode;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}

class TestImmutable {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        Date d = new Date(2000,11,28);
        ImmutableClassWithMutableRef i = new ImmutableClassWithMutableRef(10,"jyo",new City("pedana","521366"),list,d);
        System.out.println(i);
        City city = i.getCity();
        System.out.println(city.cname + "  " + city.zipcode);

        System.out.println("modifying mutable ref obj");
        city.setZipcode("7777");
        System.out.println(i);

        System.out.println("modifying list");
        list.add(50);
        System.out.println(i);

        System.out.println("modifying date");
        //Date date = i.getDate();
        d.setYear(2020);
        System.out.println(i);
    }
}
