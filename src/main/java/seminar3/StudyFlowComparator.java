package seminar3;

import java.util.Comparator;

public class StudyFlowComparator implements Comparator<StudyGroup> {
    @Override
    public int compare(StudyGroup o1, StudyGroup o2) {
        return o1.students.size() - o2.students.size();
    }
}
