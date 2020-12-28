package learning;

 public abstract class AbstractClassWithStaticMethod {



     public static void main(String args[]) {
         AbstractClassWithStaticMethod abstractClassWithStaticMethod = new AbsTest();
         abstractClassWithStaticMethod.show();
     }
     abstract void show();

}

class AbsTest extends  AbstractClassWithStaticMethod{

     void show(){
         System.out.println("show");
     }
}
