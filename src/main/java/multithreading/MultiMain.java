package multithreading;

public class MultiMain {

    public static void main(String[] args) {

        int a = 3;
        int b = 2;


        Thread thread2 = new Thread(() -> {
            while (a > b) {
                System.out.println("Loop1");
                pause(2000);
            }
        });
        thread2.start();
        Thread thread3 = thread2;




        while (true){
            System.out.println("Loop2");
            pause(1500);
        }

    }


//    public static void doSomething() {
//        System.out.println("hello");
//    }
//
//      по смыслу то же самое что
//
//    () -> {
//        System.out.println("hello");
//    }





    public static void pause(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
