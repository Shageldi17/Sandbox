package _996Zadacha;

public class Person {
    private String name;
    private int age;
    private String email;
    private String phoneNumber;

    public void setName(String name){ this.name = name;}
    public void setAge (int age){ this.age = age;}
    public void setEmail(String email){this.email = email;}
    public void setPhoneNumber(String phoneNumber){this.phoneNumber= phoneNumber;}


    public void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Электронная почта: " + email);
        System.out.println("Номер телефона: " + phoneNumber);
        System.out.println();

    }

}
