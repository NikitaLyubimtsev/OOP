package seminar4.view;

import seminar4.core.UserView;
import seminar4.model.Teacher;

import java.util.List;

public class TeacherView implements UserView<Teacher> {

    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher teacher:
             list) {
            System.out.println(teacher);
        }
        System.out.println("<--------------------->");
    }
}
