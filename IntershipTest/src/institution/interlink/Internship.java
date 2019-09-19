package institution.interlink;

import institution.University;
import person.Student;

import java.util.ArrayList;
import java.util.List;

public class Internship {
    String name;
    List<Student> betterStudents = new ArrayList<>();
    Integer averageLevel = 0;

    public Internship(String name) {
        this.name = name;
        calcAverageLevel();
        setAverageLevel();
    }

    public void checkLevelOfKnowledge(){
        for (int i = 0; i < University.getStudents().size(); i++) {
            if (University.getStudents().get(i).getKnowledge().getLevel() > getAverageLevel()) {
                this.betterStudents.add(University.getStudents().get(i));
            }
        }
    }

    public Integer calcAverageLevel() {
        averageLevel = 0;
        Integer sizeOfStudent = University.getStudents().size();
        for (int i = 0; i < sizeOfStudent ; i++) {
            averageLevel += University.getStudents().get(i).getKnowledge().getLevel();
        }
        averageLevel /= sizeOfStudent;
        return averageLevel;
    }

    public Integer getAverageLevel() {
        return averageLevel;
    }

    public void setAverageLevel() {
        this.averageLevel = averageLevel;
    }

    public String getStudents() { //виведення студентів з високими навичками
        checkLevelOfKnowledge();
        return this.betterStudents.toString();
    }
}
