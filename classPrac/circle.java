package classPrac;

import java.math.*;

public class circle implements geometry {
    private double radius;
    private double diameter;

    public circle(double radius){
        this.radius = radius;
        this.diameter = 2 * this.radius;
    }

    public double getRadius(){return radius;}
    public double getDiameter(){return diameter;}

    public void setRadius(double radius){this.radius = radius; this.diameter = 2 * radius;}
    

    public double area(){
        return Math.PI * Math.pow(radius,2);
    }

    public double perimeter(){
        return 2 * Math.PI * radius;
    }

    public void getInfo(){
        System.out.println("Radius: " + this.radius + "\n" + "Circumference: " + this.diameter);
    }
    
}
