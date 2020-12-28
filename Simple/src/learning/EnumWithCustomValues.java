package learning;

public class EnumWithCustomValues {

    public static void main(String args[]) {
        TrafficSiganl[] signals = TrafficSiganl.values();
        for(TrafficSiganl t: signals){
            System.out.println(t.name() + " " + t.getAction());
        }
    }
}

enum TrafficSiganl{
    APPLE("RED"),BANANA("yellow"),GUAVA("Green");

    String action;

    public String getAction(){
        return this.action;
    }

    private TrafficSiganl(String action){
        this.action = action;
    }
}
