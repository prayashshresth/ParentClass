package Models;
import Models.Reactangle;


public class Cuboid extends Reactangle{
    double height;

    public Cuboid(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }
    public void areacuboid() {
        ;
        double l = this.length;
        double b = this.breadth;
        double h = this.height;
        double total = l * b + l * h + h * b;
        double a = 2 * total;
        System.out.println();
    }
}
