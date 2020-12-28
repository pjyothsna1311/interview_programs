package learning;

public class Instanceof {
    public static void main(String args[]) {
        Animal animal = new Dog();
        animal.bark();

        //this is not possible. Will throw compile time Class Cast exception
        // Dog d = new Animal();


        //Compiles successfuly but exception at run time
        //Dog d = (Dog)new Animal();

        System.out.println(animal instanceof Dog);
        System.out.println(animal instanceof Animal);
    }
}

class Animal {
    void bark() {
        System.out.println("A bark");
    }

}

class Dog extends Animal {
    void bark() {
        System.out.println("b bark");
    }
}
