package seminar3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyFlow implements Iterator<StudyGroup> {

    protected final List<StudyGroup> groupList;

    StudyFlow() {
        groupList = new ArrayList<>();
    }

    void add(StudyGroup group) {
        groupList.add(group);
    }

    @Override
    public String toString() {
        return "StudyFlow{" +
                "groupList=" + groupList +
                '}';
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public StudyGroup next() {
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
