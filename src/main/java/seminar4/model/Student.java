package seminar4.model;

import seminar4.core.User;

public class Student extends User {

    public Student(String lastName, String firstName, String middleName, int age, Long id) {
        super(lastName, firstName, middleName, age, id);
    }
}
