package RaviQuestions;

public class FinalArray {
    public static void main(String args[]) {
        final int a[] = new int[5];
        int b[] = a;
        int c[] = new int[5];

        //this is not possible b/s a reference variable var declared final cannot be re-assigned to another reference variable.
        //a=c;
        FinalArray finalArray = new FinalArray();
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("B array: Before changing");
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
        System.out.println(b.hashCode());
        System.out.println(a.hashCode());
        a[0] = 1;
        System.out.println("after changing:" + a[0]);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("B array");
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
        System.out.println(b.hashCode());
        System.out.println(a.hashCode());
    }
}
