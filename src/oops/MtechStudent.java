package oops;

public class MtechStudent extends Student {

    int num_of_sub;
    float cgpa;
    double salary_offered;

    {
        num_of_sub = 6;
        cgpa = 8.0f;
        salary_offered = 900000;
    }

    public void ageValidation (int age) {
        if (age < 22) {
            throw new IllegalArgumentException("Age is not eligible for the course");
        }
    }

    public static void main (String[] args) {
        Student st = new Student();
        st.setName("Nithya");
        st.setAge(4);

        st.setGender("Female");
        st.display();
        MtechStudent mt = new MtechStudent();
        mt.ageValidation(st.getAge());
        System.out.println("Number of Subjects: " + mt.num_of_sub);
        System.out.println("CGPA: " + mt.cgpa);
        System.out.println("Salary offered: " + mt.salary_offered);

    }

}
