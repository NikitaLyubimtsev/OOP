package seminar4.controller;

import seminar4.core.UserController;
import seminar4.core.UserView;
import seminar4.model.Teacher;
import seminar4.view.TeacherView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class TeacherController implements UserController<Teacher> {

    List<Teacher> teachers;
    UserView<Teacher> view;

    Long teacherID = 0L;

    public TeacherController() {
        this.teachers = new ArrayList<>();
        this.view = new TeacherView();
    }

    private Long getID() { return teacherID++; }

    @Override
    public void create(String lastName, String firstName, String middleName, int age) {
        this.teachers.add(new Teacher(lastName, firstName, middleName, age, getID()));
    }

    private Teacher findToLastName() {
        String lastName = this.view.toLastName();
        int idx = IntStream.range(0, teachers.size())
                .filter(i -> lastName.equals(teachers.get(i).getLastName()))
                .findFirst()
                .orElse(-1);
        if (idx > -1) {
            return teachers.get(idx);
        }
        view.sendMessage("Объект не найден");
        return null;
    }

    public void edit() {
        Teacher editTeacher = findToLastName();
        Integer curField = view.currentField();
        if (editTeacher != null){
            switch (curField) {
                case 1 -> editTeacher.setLastName(view.newVal());
                case 2 -> editTeacher.setFirstName(view.newVal());
                case 3 -> editTeacher.setMiddleName(view.newVal());
                default -> view.sendMessage("Вы введи не верное значение для поиска изменяемого поля");
            }
        }
        sendOnConsole();
    }

    public void sendOnConsole() { view.sendOnConsole(teachers); }
}
