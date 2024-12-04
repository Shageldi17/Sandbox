package objects;

public class Truck extends Vehicle {     // IS-A (является): Truck является Vehicle
    private String load;

    public Truck(String model, int year, int probeg, String load) {
        super(model, year, probeg);       // DRY don't repeat yourself
        this.load = load;
    }

    @Override
    public String toString(){
        return " This is a  " + getModel() + " " + getYear() + " " + getProbeg() + " " + load;
    }
}
