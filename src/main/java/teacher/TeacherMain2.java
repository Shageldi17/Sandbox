package teacher;

public class TeacherMain2 {

    public static void main(String[] args) {
        System.out.println(Student.getTeacher());
        Student.setTeacher("myTeacher");
        System.out.println(Student.getTeacher());

//        Student.getGrade();       ТАК НЕЛЬЗЯ!
    }
}
