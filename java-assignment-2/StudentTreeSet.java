import java.util.TreeSet;
import java.util.Set;
public class StudentTreeSet {
    public  static void main(String[] args) {
        Set<Student> studentTreeSet = new TreeSet<>();
        studentTreeSet.add(new Student("Ram", 15, "XYZ"));
        studentTreeSet.add(new Student("Manushi", 12, "LQR"));
        studentTreeSet.add(new Student("Tanya", 10, "XMN"));
        studentTreeSet.add(new Student("Sita", 15, "ABC"));
        studentTreeSet.add(new Student("Laxman", 15, "XYZ"));
        studentTreeSet.add(new Student("Laxman", 10, "XYZL"));
        studentTreeSet.add(new Student("Laxman", 10, "XYZKL"));

        for(Student st: studentTreeSet){
            st.display();
        }

        Student s1 = new Student("Tanya", 10, "XMN");
        Student s2 = new Student("Hima", 10, "XMN");
        if(studentTreeSet.contains(s2)){
            System.out.println("Matched!! " + s2);
        }
        else System.out.println("Student does not exist");

    }
}
