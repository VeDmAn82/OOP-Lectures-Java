package Lesson_07.Ex003;

public class Program {

    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2);
        System.out.println(a);
        // System.out.println(a.getX());
        // System.out.println(a.getY());
        Point2D b = new Point2D(0, 5);
        System.out.println(b);
        // System.out.println(b.getX());
        // System.out.println(b.getY());
        var dis = Point2D.distance(a, b);
        System.out.println(dis);
    }
}
