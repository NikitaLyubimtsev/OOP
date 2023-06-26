package seminar4.core;

import java.util.List;

public interface UserController<T extends User> {

    void create(String lastName, String firstName, String middleName, int age);
}
