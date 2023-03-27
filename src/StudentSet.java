import java.util.HashSet;
import java.util.Set;

public class StudentSet {
    public static void main(String[] args) {
        // hash set of students
        Set<Student> studentHashSet = new HashSet<>();
        studentHashSet.add(new Student("Mohan", 10, "XYZ"));
        studentHashSet.add(new Student("Rohan", 12, "XYZMN"));
        studentHashSet.add(new Student("Siri", 8, "ABC"));
        studentHashSet.add(new Student("Sohan", 10, "QPR"));
        studentHashSet.add(new Student("Sohan", 10, "QPRs"));
        for(Student st: studentHashSet) {
            st.display();
        }
        System.out.println("====================");
        studentHashSet.add(new Student("Mohan", 10, "XYZL"));
        for(Student st: studentHashSet) {
            st.display();
        }
    }
}
