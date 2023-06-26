package seminar5.view;

import seminar5.model.Teacher;

import java.util.List;

public class TeacherView implements UserView<Teacher> {

    @Override
    public void printAll(List<Teacher> list) {
        for (Teacher teacher:
             list) {
            System.out.println(teacher);
        }
    }

}
