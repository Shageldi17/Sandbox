package hashmap;

import java.util.HashMap;

public class MainHashmap {


    //  ArrayList<Car>  [car1,car2,car3]
    //  HashMap         [car1=driver1,car2=driver2,car3=driver3]

    // HashMap of students
//            student1 -> 2
//            student2 -> 5
//            student3 -> 4

    // todo psvm на память


    // todo collections: ArrayList, LinkedList, Stack, Queue


    private static HashMap<String, Integer> studentGrades = new HashMap<>();


    //  todo ДЗ почитать про исключения, можно попробовать задачу

    public static void main(String[] args) {

        studentGrades.put("Student1", 3);
        studentGrades.put("Student2", 5);
        studentGrades.put("Student3", 4);

        System.out.println(studentGrades);

        // // TODO: 25.08.2024
        // todo remove(), clear(), replace(), get(ключ)

        System.out.println("get result: " + studentGrades.get("Student2"));



        removeAll();

    }

    private static void removeAll() {

        studentGrades.remove("Student2");
        System.out.println(studentGrades);
        System.out.println();

        Integer student1Grade = studentGrades.remove("Student1");
        System.out.println(student1Grade);
        System.out.println(studentGrades);
        System.out.println();

        Integer student3Grade = studentGrades.remove("Student3");
        System.out.println(student3Grade);
        System.out.println(studentGrades);
        System.out.println();

        Integer removedStuden4 = studentGrades.remove("Student4");
        System.out.println(student1Grade + "\n" + student3Grade);
        System.out.println(studentGrades);
        System.out.println();


        studentGrades.clear();
        System.out.println(studentGrades);
    }
}
