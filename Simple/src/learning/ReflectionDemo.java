package learning;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {

    private String s;

    public void show() {
        System.out.println("void public method");
    }
    public void show(String str) {
        System.out.println("void public method with args" + str);
    }
    private void privateMethod() {
        System.out.println("private method");
    }

}

class ReflectionTest{
    public static void main(String[] args) throws Exception {
        ReflectionDemo reflectionDemo = new ReflectionDemo();

        Class c = reflectionDemo.getClass();
        System.out.println("to get class name using reflection" + c.getName());

        Constructor constructor = c.getConstructor();
        System.out.println("constructors are" + constructor.getName());

        Method[] methods = c.getMethods();
        for(Method method : methods) {
            System.out.println("Methods are " + method.getName());
        }

        Method partucluarMethod = c.getDeclaredMethod("show",String.class);
        System.out.println("getting a particular method " + partucluarMethod.getName());

        System.out.println("Invoking the particular method");
        partucluarMethod.invoke(reflectionDemo,"jyothsna");

        Field field = c.getDeclaredField("s");
        field.setAccessible(true);
        System.out.println("to get particular field " + field.getName());
        field.set(reflectionDemo,"phani");

        Method privateMethod = c.getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true);
        privateMethod.invoke(reflectionDemo);


    }
}
