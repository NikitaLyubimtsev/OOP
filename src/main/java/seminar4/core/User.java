package seminar4.core;

import org.jetbrains.annotations.NotNull;

public class User implements Comparable<User> {

    private final Long id;
    private String lastName;
    private String firstName;
    private String middleName;
    private int age;

    public User(String lastName, String firstName, String middleName, int age, Long id) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.age = age;
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", age='" + age + '\'' +
                ", objID='" + id + '\'' +
                '}';
    }

    @Override
    public int compareTo(@NotNull User o) {
        return (int) (this.id - o.id);
    }
}
