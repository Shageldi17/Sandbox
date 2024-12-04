package objects;

public class Bus extends Vehicle {

    private int passengers;
    public Bus(String model, int year, int probeg,int passengers){
        super(model, year, probeg);
        this.passengers = passengers;

    }

    @Override
    public String toString(){
        return getModel() +  " " + getYear() + " " + getProbeg() + " " + passengers;
    }



}
