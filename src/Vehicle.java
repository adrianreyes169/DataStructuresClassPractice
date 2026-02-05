public abstract class Vehicle {
    private double miles;
    private int yearManufactured;

    public Vehicle(double miles, int yearManufactured){
        this.miles = miles;
        this.yearManufactured = yearManufactured;
    }

    public double getMiles(){return this.miles;}
    public int getYear(){return this.yearManufactured;}

    public void setMiles(double newMiles){this.miles = newMiles;}
    public void setYear(int newYear){this.yearManufactured = newYear;}

    public abstract void move();
}
