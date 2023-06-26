package seminar5.service;

import seminar5.DataApp;
import seminar5.model.Student;
import seminar5.model.StudyGroup;
import seminar5.model.Teacher;
import seminar5.model.User;

import java.util.List;
import java.util.stream.IntStream;

public class DataService {

    DataApp dataSRV = new DataApp();

    public void add(User o) {
        if (o instanceof Student) { dataSRV.students.add((Student) o); }
        else if (o instanceof Teacher) { dataSRV.teachers.add((Teacher) o); }
    }

    public void addGroup(StudyGroup group) {

    }

    public List<Student> allStudents() { return dataSRV.students; }

    public List<Teacher> allTeachers() { return dataSRV.teachers; }
}
