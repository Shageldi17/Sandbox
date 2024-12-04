package abstractkeyword;

public class Programmer extends Employee {


    @Override           // переопределение это полиморфизм
    public void doWork() {
        System.out.println("psvm");
    }

}
