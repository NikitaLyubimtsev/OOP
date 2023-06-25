package seminar3;

import java.util.Iterator;
import java.util.List;

public class StudyGroupIterator<Student> implements Iterator<Student> {

    int idx = 0;
    private final List<Student> students;

    StudyGroupIterator (List<Student> studentList) {
        students = studentList;
    }

    @Override
    public boolean hasNext() {
        return idx < students.size();
    }

    @Override
    public Student next() {
        return students.get(idx++);
    }

    @Override
    public void remove() {
        //while (hasNext()) {
            students.remove(idx++);
       // }
    }
}
