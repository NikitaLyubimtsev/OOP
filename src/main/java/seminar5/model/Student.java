package seminar5.model;

import org.jetbrains.annotations.NotNull;

public class Student extends User{

    private final int studentID;

    public Student(String lastName, String firstName, int id) {
        super(lastName, firstName);
        this.studentID = id;
    }

    public int getStudentID() {
        return studentID;
    }

    @Override
    public int compareTo(@NotNull User o) {
        return 0;
    }
}
