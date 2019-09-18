package institution;

import person.Student;

import java.util.ArrayList;
import java.util.List;

public class University {
    String name;
    List<Student> students = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public void setStudent(Student student) { //набір студентів в ліст
        //=====
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return this.students;
    }
}

//electricityAccounting.addMonthData(dataForTheMonth);

//public void addMonthData(DataForTheMonth data) {
//		allData.add(data);
// }