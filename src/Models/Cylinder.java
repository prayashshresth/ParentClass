package Models;
import Models.Circle;

public class Cylinder extends Circle {

    double height;

    public Cylinder(double radius, double pie, double height) {
        super(radius, pie);
        this.height = height;

    }
    public void area(){
        double r=this.radius;
        double p1=this.pie;
        double h=this.height;
        double area=p1*(r*h);


    }
}
