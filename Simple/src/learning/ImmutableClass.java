package learning;


//String and all Wrrapper classes are immutable.
public final class ImmutableClass {
    final int id;
    ImmutableClass(int id) {
        this.id =id;
    }
    public static void main(String args[]) {

        ImmutableClass immutableClass = new ImmutableClass(20);

        //Immutable classes are the ones whose object cannot be modified once they are created. Any modification to immutable obj will create another
        //immutable obj just like String.
        //immutableClass.id = 100;
        System.out.println(immutableClass.getId());
    }

    public int getId() {
        return id;
    }
}
