package oops;

public class BtechStudent extends Student {

    static int num_of_sub;
    static float cgpa;
    static double salary_offered;

    static {
        num_of_sub = 10;
        cgpa = 9.5f;
        salary_offered = 500000;
    }

    public static double salary(float cgpa, double salary_offered) {
        if (cgpa > 9 && cgpa <=10) {
            salary_offered = salary_offered + (salary_offered * 10/100);
            return salary_offered;
        }
        else if (cgpa > 10 || cgpa < 0) {
            throw new IllegalArgumentException("Please enter a valid cgpa");
        }
        else {
            return salary_offered;
        }
    }

    //Overriding display method from super class
    public void display() {
        System.out.println("Displaying from Sub class by overriding method");
        System.out.println("Name of the Student: " + getName());
        System.out.println("Age of the Student: " + getAge());
        System.out.println("Gender of the Student: " + getGender());
    }

    public static void main (String[] args) {
        /*Student st = new Student();
        st.setName("Hemanth");
        st.setAge(32);
        st.setGender("Male");*/
        Student bs = new BtechStudent(); //can also use parent class reference
        bs.setName("Hemanth");
        bs.setAge(32);
        bs.setGender("Male");
        bs.display();
        /*System.out.println("Name of the student: " + st.getName());
        System.out.println("Age of the student: " + st.getAge());
        System.out.println("Gender of the student: " + st.getGender());
        */
        System.out.println("CGPA of the student: " + BtechStudent.cgpa);
        System.out.println("Salary offered: " + salary(cgpa, salary_offered));
    }


}
