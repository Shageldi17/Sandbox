package array;

public class MainArray {
    public static void main(String[] args) {
        String[] namesOfDays1 = new String[7];
//        namesOfDays[0] = "Monday";
//        namesOfDays[1] = "Tuesday";
//        namesOfDays[2] ="Wednesday";
//        namesOfDays[3] = "Thursday";
//        namesOfDays[4] = "Friday";
//        namesOfDays[5] = "Saturday";
//        namesOfDays[6] = "Sunday";
        for (int i = 0; i < namesOfDays1.length-1; i++){
            System.out.print(namesOfDays1[i] + ", ");
//            if (i < namesOfDays.length - 1){
//                System.out.print(", ");
//            } else {
//                System.out.print(". ");
//            }

        }
        System.out.println(namesOfDays1[6] + ".");
        System.out.println();
        String[] namesOfDays = {"Monday, ", "Tuesday, ","Wednesday, ","Thursday, ","Friday, ","Saturday, ","Sunday."};
//        namesOfDays[6] = "Funday";
        for (int i = 0; i < namesOfDays.length; i++ ) {
            System.out.print(namesOfDays[i]);
        }

        int[][] grades = new int[3][5];
        System.out.println(grades);

//        [0][0][0]
//        [0][0][0]
//        [0][0][0]
//        [0][0][0]
//        [0][0][0]
    }
}
