package seminar4.controller;

import seminar4.core.User;
import seminar4.core.UserController;
import seminar4.core.UserView;
import seminar4.model.Student;
import seminar4.view.StudentView;

import java.util.ArrayList;
import java.util.List;

public class StudentController implements UserController<Student> {

    List<Student> students;
    Long studentID = 0L;

    public StudentController() {
        this.students = new ArrayList<>();
    }

    private Long getID() { return studentID++; }

    @Override
    public void create(String lastName, String firstName, String middleName, int age) {
        this.students.add(new Student(lastName, firstName, middleName, age, getID()));
    }

    public void sendOnConsole() {
        UserView<Student> view = new StudentView();
        view.sendOnConsole(students);
    }
}
