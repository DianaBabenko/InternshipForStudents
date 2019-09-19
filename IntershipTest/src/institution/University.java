package institution;

import person.Student;
import java.util.ArrayList;
import java.util.List;

public class University {
    String name;
    public static List<Student> students = new ArrayList<>();
    Student student;

    public University(String name) {
        this.name = name;
    }

    public void setStudent(Student student) { //набір студентів в ліст
        //=====
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public static List<Student> getStudents() {
        return students;
    }
}
