package seminar3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterable<Student> {

    protected final List<Student> students;

    public StudyGroup(StudyFlow flow) {
        students = new ArrayList<>();
        flow.add(this);
    }

    public Iterator<Student> iterator() {
        return new StudyGroupIterator<>(students);
    }

    public StudyGroup addStudent(Student student) {
        this.students.add(student);
        return this;
    }

    public List<Student> toList() {
        List<Student> result = new ArrayList<>();
        for (Student student: this) {
            result.add(student);
        }
        return result;
    }
}

