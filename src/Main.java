import Models.Circle;
import Models.Cuboid;
import Models.Cylinder;
import Models.Reactangle;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(4.5,3.14);
        System.out.println(circle1);
        Cylinder cylinder1 = new Cylinder(5.5,3.14,12);
        System.out.println();
        Reactangle reactangle1 = new Reactangle(5.5,3.4);
        System.out.println();
        Cuboid cuboid1 = new Cuboid(2.4,5.6,7.5);
    }
}
