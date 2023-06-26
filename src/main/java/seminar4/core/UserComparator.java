package seminar4.core;

import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return (o1.getLastName() + o1.getFirstName() + o1.getMiddleName()).compareTo(o2.getLastName() + o2.getFirstName() + o2.getMiddleName());
    }
}
