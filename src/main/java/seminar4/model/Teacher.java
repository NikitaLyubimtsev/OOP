package seminar4.model;

import seminar4.core.User;

public class Teacher extends User {

    public Teacher(String lastName, String firstName, String middleName, int age, Long id) {
        super(lastName, firstName, middleName, age, id);
    }
}
