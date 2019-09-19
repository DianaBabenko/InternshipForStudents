package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko",70));
        university.addStudent(new Student("Julia Veselkina",9));
        university.addStudent(new Student("Maria Perechrest",37));
        university.addStudent(new Student("Dasha Pretty",46));
        university.addStudent(new Student("Cara Mavella",12));

        Internship internship = new Internship("Interlink");
        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
        System.out.println(internship.getAverageLevel());
    }
}
