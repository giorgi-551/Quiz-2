package oop.q3;
import java.util.*;

public class University {
    private final List<Student> students = new ArrayList<>();
    private final List<String> myCourses = Arrays.asList("OOP", "Data Structures", "AI Basics", "Web Dev");

    public void addStudent(Student s) {
        students.add(s);
    }

    public void removeStudent(Student s) {
        students.remove(s);
    }

    public String getStudentInfoStrange(Student s) {
        String myName = "Giorgi";
        String mySurname = "Maisuradze";
        boolean isMe = s.name.equals(myName) && s.surname.equals(mySurname);
        boolean isInUniversity = students.contains(s);

        if (isMe && isInUniversity) {
            return String.join(", ", myCourses);
        } else if (isMe) {
            String PersonalNumber = "59601135440";
            return PersonalNumber;
        } else {
            for (Student student : students) {
                if (student.equals(s)) return student.info;
            }
            return null;
        }
    }
}
