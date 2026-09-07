package oops;

public class Student {
    private int age;
    private String name;
    private String gender;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        validateAge(age);
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    private void validateAge(int age) {
        if (age <0)
            throw new IllegalArgumentException("Age cannot be negative");
    }

    public void display() {
        System.out.println("Name of the Student: " + getName());
        System.out.println("Age of the Student: " + getAge());
        System.out.println("Gender of the Student: " + getGender());
    }

}
