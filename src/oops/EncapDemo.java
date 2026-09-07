package oops;

public class EncapDemo {

    public static void main(String[] args) {
        Student st = new Student();
        st.setAge(30);
        st.setName("Sravya");
        st.setGender("Female");
        System.out.println("Name of the student is: " + st.getName());
        System.out.println("Age of the student is: " + st.getAge());
        System.out.println(("Gender of the student is: " + st.getGender()));
    }
}
