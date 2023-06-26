package seminar5;

import seminar5.controller.Controller;
import seminar5.view.StudentView;

public class App {
    public static void main(String[] args) {

        Controller ctrl = new Controller();
        ctrl.createStudent();
        ctrl.createStudent();
        ctrl.createStudent();

        ctrl.printAllStudent();

        ctrl.createGroup();

    }
}
