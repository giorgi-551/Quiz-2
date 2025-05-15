package oop.q3;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        University uni = new University();

        Student me = new Student("Giorgi", "Maisuradze", "Georgia", "I like Java");
        Student other = new Student("Ana", "Smith", "UK", "International student");
        Student stranger = new Student("Gigi", "Maisuradze", "Georgia", "Secret agent");

        uni.addStudent(me);
        uni.addStudent(other);

        System.out.println(uni.getStudentInfoStrange(me));       //courses
        uni.removeStudent(me);
        System.out.println(uni.getStudentInfoStrange(me));       // ID
        System.out.println(uni.getStudentInfoStrange(other));    // Their info
        System.out.println(uni.getStudentInfoStrange(stranger)); // null
    }
}



