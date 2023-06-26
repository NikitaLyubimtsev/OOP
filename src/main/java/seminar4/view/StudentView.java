package seminar4.view;

import seminar4.core.UserView;
import seminar4.model.Student;

import java.util.List;

public class StudentView implements UserView<Student> {
    @Override
    public void sendOnConsole(List<Student> list) {
        for (Student student:
             list) {
            System.out.println(student);
        }
        System.out.println("<--------------------->");
    }

}
