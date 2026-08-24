package basics;

public class Student {

    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void display() {
        System.out.println("Name of the Student: " + name);
        System.out.println("Age of the Student: " + age);
    }
}
