package abstractkeyword;

public abstract class Employee {

    public static void printClassName() {
        System.out.println("Employee.class");
    }


//    public void doWork() {
//        System.out.println("working...");
//    }

    public abstract void doWork();
}
