package institution;

import person.Student;
import java.util.ArrayList;
import java.util.List;

public class University {
    String name;
    static Integer averageLevel = 0;

    public static List<Student> students = new ArrayList<>();
    public static List<Student> betterStudents = new ArrayList<>();


    public University(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
        calcAverageLevel();
    }

    public static List<Student> getStudents() {
        return students;
    }

    public Integer calcAverageLevel() {
        averageLevel = 0;
        Integer sizeOfStudent = University.getStudents().size();
        for (int i = 0; i < sizeOfStudent ; i++) {
            averageLevel += University.getStudents().get(i).getKnowledge().getLevel();
        }
        averageLevel /= sizeOfStudent;
        setAverageLevel(averageLevel);
        return averageLevel;
    }

    public void setAverageLevel(Integer averageLevel) {
        this.averageLevel = averageLevel;
    }

    public static Integer getAverageLevel() {
        return averageLevel;
    }

    public static String getBetterStudents() {
        return betterStudents.toString();
    }

    public static void checkLevelOfKnowledge(){
        for (int i = 0; i < University.getStudents().size(); i++) {
            if (University.getStudents().get(i).getKnowledge().getLevel() > getAverageLevel()) {
                betterStudents.add(University.getStudents().get(i));
            }
        }
    }
}
