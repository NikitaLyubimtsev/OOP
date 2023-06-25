package seminar3;

import java.util.Comparator;

public class StudyComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        String f_n1 = o1.getLastName() + o1.getFirstName();
        String f_n2 = o2.getLastName() + o2.getFirstName();
        return f_n1.compareTo(f_n2);
    }
}
