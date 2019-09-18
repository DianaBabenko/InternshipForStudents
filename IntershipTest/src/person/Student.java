package person;

import person.consciousness.Knowledge;

public class Student {
    //public static
    String name;
    Knowledge knowledge;
    //Integer levelOfKnowledge;

    public Student(String name, int level) {
        this.name = name;
        this.knowledge = new Knowledge(level);
        //this.levelOfKnowledge = level;
        //this.level = level;
    }

    public Knowledge getLevel() {
        return this.knowledge;
    }
    /*public Integer getStKnowledge() {
        return levelOfKnowledge = Knowledge.getKnowledge();
    }*/

    /*public void setKnowledge(Knowledge knowledge) { //====
        this.levelOfKnowledge = Knowledge.getKnowledge();
    }*/


}

