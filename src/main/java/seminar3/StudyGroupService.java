package seminar3;

import java.util.Collections;

public class StudyGroupService {
    private final StudyGroup group;

    StudyGroupService(StudyGroup currentGroup) {
        group = currentGroup;
    }
    public void removeToFIO (String lastName, String firstName, String middleName) {
        group.students.removeIf(student -> lastName.equals(student.getLastName())
                && firstName.equals(student.getFirstName())
                && middleName.equals(student.getMiddleName()));
    }

    public void sortToId() {
        Collections.sort(group.students);
    }

    public void sortToFIO() {
        StudyComparator comp = new StudyComparator();
        group.students.sort(comp);
    }
}
