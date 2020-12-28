package learning;

public class Overloading {

    public static void main(String args[]) {
        Overloading overloading= new Overloading();
        overloading.add(10,20,30);
        overloading.add(10.0,30.0);
    }


    void add(int a, int b){
        System.out.println(a+b);

    }

    //overloading by changing no of arguements
    void add(int a, int b, int c){
        System.out.println(a+b+c);

    }

    //overlading by changing type
    void add(double a, double b){
        System.out.println(a+b);

    }


    //method overloading is not possible just by changing the return type of method
    /*int add(int a,int b){
        System.out.println(a+b);
        return a;
    }*/


}
