package abstractkeyword;

public class MainAbstract {

    public static void main (String[] args){

        Employee.printClassName();  // static method

//        Employee employee = new Employee();           // abstract, so not possible
//        employee.doWork();          // nonstatic method

        Programmer programmer = new Programmer();
        programmer.doWork();


        Doctor doctor = new Doctor();
        doctor.doWork();

    }
}
