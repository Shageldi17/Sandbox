package _994mvc2;

public class User {
    private String name;
    private int age;

    // конструктор
    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Геттеры
    public String getName(){return name;}
    public int getAge(){return age;}
}
