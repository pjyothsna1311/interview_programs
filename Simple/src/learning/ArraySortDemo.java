package learning;

public class ArraySortDemo {

    public static void main(String[] args) {
        int a[] =  {90, 45,60};
        int temp;
        for (int i =0;i<a.length;i++) {
            for(int j = i+1 ;j <a.length; j++) {
                if(a[i] > a[j]) {
                    temp =a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int k : a) {
            System.out.println(k);
        }
    }
}
