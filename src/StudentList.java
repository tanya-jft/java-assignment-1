import java.util.*;



public class StudentList {
    public static void main(String[] args) {
        // arrayList of students
        List<Student> students = new ArrayList<>();
        students.add(new Student("Mohan", 10, "XYZ"));
        students.add(new Student("Rohan", 13, "PQR"));
        students.add(new Student("Sohan", 15, "LMN"));
        students.add(new Student());
        students.add(new Student());

        for(Student st: students) {
            st.display();
        }

        // if student exist or not
        Student obj = new Student("abcd", 10, "mno");
        if(students.contains(obj)) {
            System.out.println(obj);
        }
        else System.out.println("Object doesn't exist");

    }
}