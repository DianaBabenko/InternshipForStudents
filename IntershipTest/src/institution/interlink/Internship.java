package institution.interlink;

import institution.University;

public class Internship {
    String name;

    public Internship(String name) {
        this.name = name;
    }

    public String getStudents() { //get students for internship
        University.checkLevelOfKnowledge();
        return University.getBetterStudents();
    }
}
