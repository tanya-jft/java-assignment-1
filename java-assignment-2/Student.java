import java.util.*;

class Student implements Comparable<Student>{
    String name;
    int age;
    String course;

    // default constructor
    Student(){
        this("Ram", 12, "ABC");
    }
    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void  display() {
        System.out.println("Name: " + this.name + " Age: " + this.age + " Course: " + this.course);
    }

    @Override
    public String toString() {
        return ("Name: " + this.name + " Age: " + this.age + " Course: " + this.course);
    }

    @Override
    public boolean equals(Object o) {
//        if(this == o) return true;
        if(o == null || !(getClass() == o.getClass())) return false;
        Student s = (Student) o;
        return (s.name == this.name) && (s.age == this.age) && (s.course == this.course);
    }

    @Override
    public int hashCode(){
        return this.age + Objects.hash(this.name) + Objects.hash(this.course);
//        return Objects.hash(this.age, this.name, this.course);
    }
    @Override
    public int compareTo(Student s){
        if(this.name.compareToIgnoreCase(s.name) == 0) {
            if(this.age == s.age){
                return this.course.compareToIgnoreCase(s.course);
            }
            return this.age - s.age;
        }
        return this.name.compareToIgnoreCase(s.name);
    }
}
