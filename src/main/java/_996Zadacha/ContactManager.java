package _996Zadacha;

import _996Zadacha.Person;

public class ContactManager {
    public static void main (String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        person1.displayInfo();
        person2.displayInfo();
        System.out.println();



        person1.setName("Alice Johnson");
        person1.setAge(25);
        person1.setEmail("alice.johnson@example.com");
        person1.setPhoneNumber("123-456-7890");

        person2.setName("Bob Smith");
        person2.setAge(30);
        person2.setEmail("bob.smith@example.com");
        person2.setPhoneNumber("987-654-3210");


        person1.displayInfo();
        person2.displayInfo();
    }
}
