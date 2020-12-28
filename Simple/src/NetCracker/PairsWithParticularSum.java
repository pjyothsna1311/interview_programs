package NetCracker;

public class PairsWithParticularSum {

    public static void main(String[] args) {
        int a[] = {20,60,40,50,80,90,5,10,95};
        int sum = 100;
        for(int i =0;i <a.length;i++) {
            for(int j= i+1; j<a.length;j++) {
                int result = a[i] + a[j];
                if(result == sum) {
                    System.out.println("pairs with " + sum + "are " + a[i] + "  " + a[j]);
                }
            }
        }
    }
}
