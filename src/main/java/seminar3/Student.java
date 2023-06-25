package seminar3;

import org.jetbrains.annotations.NotNull;

public class Student implements Comparable<Student> {

    private Long id;
    private String lastName;
    private String firstName;
    private String middleName;
    private int age;

    public Student(long id, String lastName, String firstName, String middleName, int age) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
        return String.format("Студент: %s, %s, %s. %d лет!", getLastName(), getFirstName(), getMiddleName(), getAge());
    }

    @Override
    public int compareTo(@NotNull Student o) {
        return (int) (this.id - o.id);
    }
}
