package person;

import person.consciousness.Knowledge;

public class Student {
    String name;
    Knowledge knowledge;

    public Student(String name, int level) {
        this.name = name;
        this.knowledge = new Knowledge(level);
    }

    public Knowledge getKnowledge() {
        return this.knowledge;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return String.format("%s : %s",
                this.getName(), getKnowledge().getLevel());
    }

}

