package DesignPatterns;

public class CompositeDesignPattern {

}

class CompositeTest{
    public static void main(String[] args) {

    }
}

class Leaf implements Component{
    int price;

   public void showPrice() {

    }
}

class Composite implements Component{
    String name;
    public void showPrice() {

    }
}

//To maintain some commanality between leaf and Composite
interface Component{
    void showPrice();
}
