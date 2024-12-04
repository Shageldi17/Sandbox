package objects;

public class Vehicle extends Object {
    private String model;
    private int year;
    private int probeg;


    public Vehicle(String model, int year, int probeg){
        this.model = model;
        this.year = year;
        this.probeg = probeg;
    }

    public String getModel(){return model;}

    public int getYear() {return year;}
    public int getProbeg(){return probeg;}

    @Override
    public String toString(){
        return String.format("This is a vehicle with model %s and year %s and probeg %s", model, year, probeg);
  }






    //    public void setModel(String myModel) {    // это не поле, это параметр
//        model = myModel;
//    }
////        model = "Honda";         }

//    public int getProbeg() {
//        return probeg;
//    }

//    public String getModel() {
//        return this.model;
//    }

//    public void drive(int distance) {
//        System.out.println("driving");
//        probeg += distance;
//        System.out.println("new distance " + this.probeg);
//    }
}
