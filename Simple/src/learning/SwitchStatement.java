package learning;

public class SwitchStatement {
    public enum Day {sun,mon};

    public static void main(String args[]) {
        Day[] dayNow = Day.values();
        for(Day now: dayNow){
            switch (now) {
                case sun:
                    System.out.println(now);
                    break;
                case mon:
                    System.out.println(now);
                    break;
            }
        }

        int a= 10;
        String name = "jyo";
        switch (a) {
            case 10:
                System.out.println(a);

            //nested switch
                switch (name) {
                    case "jyo": System.out.println(name);
                    break;
                    case "phani" :System.out.println("phani");
                }

                //if we dont use break case 20 and default also will gets executed
                break;
            case 20:
                System.out.println(20);
                break;
            default:
                System.out.println("nothing");
        }
    }
}
