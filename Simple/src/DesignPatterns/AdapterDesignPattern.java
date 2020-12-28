package DesignPatterns;

//Structural Pattern
public class AdapterDesignPattern {
}

class School {
    public static void main(String[] args) {
        AssignmentWork a = new AssignmentWork();
        a.writeAssignment("Write the assignment");
    }

}

class AssignmentWork{
    //To write assignment we need Pen
    private Pen p;
    public Pen getP() {
        return p;
    }

    public void setP(Pen p) {
        this.p = p;
    }
    public void writeAssignment(String str) {
        p.write("Write assignment");
    }
}

interface Pen{
    void write(String str);
}
