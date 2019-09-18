package institution.interlink;

import institution.University;
import person.Student;

import java.util.ArrayList;
import java.util.List;

public class Internship {
    String name;
    List <Student> students = new ArrayList<>();
    this.students = University.getStudents();
    //===== передать лист студентов

    public Internship(String name) {
        this.name = name;
    }


    // відібрати студентів з високими навичками
    public List<Student> getBetterStudent(){
        List<Student> betterStudents = new ArrayList<>();

        for (int i = 0; i < this.students.size(); i++) {
            if (this.students.get(i).getLevel().getKnowledge() > 50) {
                betterStudents.add(students.get(i));
            }
        }
        return betterStudents;
    }

    /*// отримати студентів з високими навичками
    public void setStudent(Student student) {
        students.add(student);
    }*/




    public String getStudents() { //виведення студентів з високими навичками

        return getBetterStudent().toString();
    }
}
