package seminar5.controller;

import seminar5.model.Student;
import seminar5.model.StudyGroup;
import seminar5.model.Teacher;
import seminar5.service.DataService;
import seminar5.service.StudyGroupService;
import seminar5.view.StudentView;
import seminar5.view.TeacherView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Controller {

    StudentView studentView = new StudentView();
    TeacherView teacherView = new TeacherView();
    DataService dataService = new DataService();
    StudyGroupService studyGroupService = new StudyGroupService();


    public void createStudent() {
        studentView.sendMessage("Создание нового студента: ");
        Student student = new Student(studentView.toLastName(),
                studentView.toFirstName(),
                this.dataService.allStudents().size());
        this.dataService.add(student);
        studentView.sendMessage("Cтудент успешно создан!");
        studentView.separator();
    }

    private Teacher createTeacher() {
        teacherView.sendMessage("Создание нового учителя: ");
        Teacher teacher = new Teacher(teacherView.toLastName(),
                teacherView.toFirstName(),
                this.dataService.allTeachers().size());
        this.dataService.add(teacher);
        teacherView.sendMessage("Учитель успешно создан!");
        teacherView.separator();
        return teacher;
    }

    public void getStudent(int idx) {
        if (dataService.allStudents().size() > idx) {
            final Student student = this.dataService.allStudents().get(idx);
            studentView.printUser(student);
        } else {
            studentView.sendMessage("Пользователь с таким индексом не найден!");
        }
    }

    public void printAllStudent() {
        studentView.printAll(dataService.allStudents());
    }

    public List<Student> studentList() {
        return dataService.allStudents();
    }

    public void createGroup() { printGroup(studyGroupService.createGroup(createTeacher(), studentList())); }

    public void printGroup(StudyGroup group) {
        teacherView.sendMessage("Группа учителя:");
        teacherView.printUser(group.getTeacher());
        studentView.printAll(group.getStudents());
        studentView.separator();
    }

}
