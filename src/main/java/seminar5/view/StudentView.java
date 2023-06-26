package seminar5.view;

import seminar5.model.Student;

import java.util.List;

public class StudentView implements UserView<Student> {

    @Override
    public void printAll(List<Student> list) {
        for (Student student:
                list) {
            System.out.println(student);
        }
    }
}
