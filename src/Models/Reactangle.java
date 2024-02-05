package Models;

public class Reactangle {
    double length;

    double breadth;

    public Reactangle(double  length, double breadth) {
        this.length = length;
        this.breadth = breadth;

    }
    public void area(){
        double l= this.length;
        double b= this.breadth;
        double area =l*b;
        System.out.println(area);


    }
}

