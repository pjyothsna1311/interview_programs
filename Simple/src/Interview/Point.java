package Interview;

public class Point {
    int x,y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Point p = new Point(500,600);
        System.out.println(p.x + " " + p.y);
        p.modifyPoint(p);
        System.out.println(p.x + " " + p.y);
        p.chnagePoint(p);
        System.out.println(p.x + " " + p.y);
    }

    void modifyPoint(Point p) {
        p.x = 100;
        p.y = 200;
    }
    void chnagePoint(Point p) {
        p = new Point(50,60);
    }
}
