package seminar4;

import seminar4.controller.StudentController;
import seminar4.controller.TeacherController;
import seminar4.core.User;
import seminar4.model.Student;

public class App {
    public static void main(String[] args) {

        StudentController sCtrl = new StudentController();
        sCtrl.create("A", "B", "C", 21);
        sCtrl.create("D", "E", "F", 21);
        sCtrl.sendOnConsole();

        TeacherController tCtrl = new TeacherController();
        tCtrl.create("G", "H", "I", 45);
        tCtrl.create("J", "K", "U", 55);
        tCtrl.sendOnConsole();
        tCtrl.edit();
    }
}
