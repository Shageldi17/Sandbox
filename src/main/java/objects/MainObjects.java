package objects;

public class MainObjects {


    public static void main(String[] args) {

        Vehicle myVehicle = new Vehicle("Skoda", 2024,100 );
        Vehicle vehicle2 = new Vehicle("Honda",2000,200);

        System.out.println(myVehicle);// вызывает метод toString() класса Car


//        ArrayList<Car> cars = new ArrayList<>();
//        cars.add(myCar);
//        cars.add(car2);
//        System.out.println(cars);




    }

    public static void objectPractice(){
        Vehicle myVehicle = new Vehicle("Skoda", 2024,100 );
        String model = myVehicle.getModel();
        System.out.println(model);
        int year = myVehicle.getYear();
        System.out.println(year);
        int probeg = myVehicle.getProbeg();
        System.out.println(probeg + " km");


//        Car myCar = new Car();
//        System.out.println(myCar.getModel());
//        myCar.setModel("BMW") ;
//        System.out.println(myCar.getModel());           //  модель поменяли

        //  объявление переменной           Car myCar
//        обращение к переменной            myCar
//        описание метода (в Car.java)      public void drive() {}      с телом {}
//        вызов метода (в Main.java)        myCar.drive()               без тела {}

//
//        while(myCar.getProbeg() < 500) {
//            myCar.drive(25);
//        }
    }
}
