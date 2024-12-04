package teacher;

public class TeacherMain {
    static Student student1 = new Student();
    static Student student2 = new Student();
    static Student student3 = new Student();

    public static void main(String[] args) {
        printContents();

        student1.setGrade(4);
        student2.setGrade(3);
        student3.setGrade(5);

        Student.setTeacher("Teacher");
        Student.setTeacher("mentor");
        Student.setTeacher("professor");

        System.out.println("Students contents changed!");
        System.out.println();

        printContents();
    }
    public static void printContents() {
        System.out.println("Students 1 : " + student1.getGrade());
        System.out.println("Students 2 : " + student2.getGrade());
        System.out.println("Students 3 : " + student3.getGrade());
        System.out.println();


        System.out.println("Students 1 teacher: " + student1.getTeacher());
        System.out.println("Students 2 teacher: " + student2.getTeacher());
        System.out.println("Students 3 teacher: " + student3.getTeacher());
        System.out.println();
        System.out.println();

    }


}
