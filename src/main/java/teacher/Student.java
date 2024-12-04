package teacher;

public class Student {


    private static String teacher;
    private int grade;

    public int getGrade(){ return grade; }
    public void setGrade(int grade){ this.grade = grade; }
    public static String getTeacher(){ return teacher;}
    public static void setTeacher(String teacher){ Student.teacher = teacher;}
}
