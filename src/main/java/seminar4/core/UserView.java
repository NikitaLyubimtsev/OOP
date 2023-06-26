package seminar4.core;

import java.util.List;
import java.util.Scanner;

public interface UserView<T extends User> {

    Scanner scanner = new Scanner(System.in);
    
    void sendOnConsole(List<T> list);

    default void sendMessage(String message) {
        System.out.println(message);
        System.out.println("<--------------------->");
    }
    
    default void userField() {
        System.out.println("""
                1. lastName
                2. firstName
                3. MiddleName
                """);
    }

    default String toLastName() {
        sendMessage("Введите Фамилию для поиска: ");
        return this.scanner.nextLine();
    }

    default Integer currentField() {
        sendMessage("Выберите параметр для редактирования:");
        userField();
        return Integer.parseInt(this.scanner.nextLine());
    }
    default String newVal() {
        sendMessage("Введите новое значение: ");
        return this.scanner.nextLine();
    }
}
