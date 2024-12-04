package abstractkeyword;

public class Doctor extends Employee implements Worker {

     @Override
     public void doWork(){
          System.out.println( "Do surgery");
     }

     @Override
     public void rest() {
          System.out.println("The doctor is resting...");
     }

     @Override
     public void sleep(int time) {
          System.out.println("The doctor sleeps for " + time + " minutes");
     }


}
