package seminar5;

import seminar5.model.Student;
import seminar5.model.StudyGroup;
import seminar5.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class DataApp {

    public List<Student> students;
    public List<Teacher> teachers;
    public List<StudyGroup> groups;

    public DataApp() {
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.groups = new ArrayList<>();
    }

}
