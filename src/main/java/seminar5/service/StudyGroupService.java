package seminar5.service;

import seminar5.DataApp;
import seminar5.model.Student;
import seminar5.model.StudyGroup;
import seminar5.model.Teacher;

import java.util.List;

public class StudyGroupService extends DataService {

    StudyGroup group;

    public StudyGroup createGroup(Teacher teacher, List<Student> students) {
        this.group = new StudyGroup(teacher, students);
        addGroup(this.group);
        return this.group;
    }


}
