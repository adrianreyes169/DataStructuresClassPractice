public class Car extends Vehicle {
    private String model;

    public Car(double miles, int yearManufactured, String model){
        super(miles,yearManufactured);
        this.model = model;
    }

    public String getModel(){return this.model;}
    public void setModel(String newModel){this.model = newModel;}

    @Override
    public void move(){
        System.out.println("Moving");
    }
    
}
