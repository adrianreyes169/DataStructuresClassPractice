public class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength(){return this.length;}
    public double getWidth(){return this.width;}

    public void setLength(double newLength){this.length = newLength;}
    public void setWidth(double newWidth){this.width = newWidth;}

    @Override
    public double getArea(){
        return this.length * this.width;
    }

    @Override
    public double getPerimeter(){
        return 2 * (this.length + this.width);
    }
    
}
