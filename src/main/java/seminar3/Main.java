package seminar3;

public class Main {

    public static void main(String[] args) {

        StudyFlow flow1 = new StudyFlow();
        StudyGroup g1 = new StudyGroup(flow1);
        StudyGroup g2 = new StudyGroup(flow1);

        g1.addStudent(new Student(4L, "U", "AC", "B", 16))
                .addStudent(new Student(2L, "A", "AS", "C", 14))
                .addStudent(new Student(3L, "Y", "AB", "W", 21))
                .addStudent(new Student(1L, "W", "AW", "X", 31));

        g2.addStudent(new Student(5L, "UF", "AC", "B", 16))
                .addStudent(new Student(8L, "SD", "AS", "C", 14))
                .addStudent(new Student(7L, "ZA", "AB", "W", 21));

        for (Student student: g1) {
            System.out.println(student);
        }

        Controller controller = new Controller(flow1, g1);
        controller.sortToId();
        System.out.println(g1);
       // controller.remove("A", "AS", "C");
        controller.sortToFio();
        System.out.println(g1);
        controller.sortToStudentSize();
        System.out.println(flow1);
    }
}
