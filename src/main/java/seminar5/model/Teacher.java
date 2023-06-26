package seminar5.model;

import org.jetbrains.annotations.NotNull;

public class Teacher extends User {

    private final int teacherID;

    public Teacher(String lastName, String firstName, int teacherID) {
        super(lastName, firstName);
        this.teacherID = teacherID;
    }

    public int getTeacherID() {
        return teacherID;
    }

    @Override
    public int compareTo(@NotNull User o) {
        return 0;
    }
}
