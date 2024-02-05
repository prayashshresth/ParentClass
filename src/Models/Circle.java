package Models;

public class Circle {

    double radius;

    double pie;

    public Circle(double radius, double pie) {
        this.radius = radius;
        this.pie = pie;

    }
    public void area(){
        double r= this.radius;
        double p1= this.pie;
        double area =p1*(r*r);

    }
}
