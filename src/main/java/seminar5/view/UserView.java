package seminar5.view;

import seminar5.model.User;

import java.util.List;
import java.util.Scanner;

public interface UserView<T extends User> {

    Scanner scanner = new Scanner(System.in);
    
    void printAll(List<T> list);

    default void printUser(User user) {
        System.out.println(user);
    }

    default void sendMessage(String message) {
        System.out.println(message);
    }

    default void separator() {
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
        sendMessage("Введите Фамилию: ");
        return this.scanner.nextLine();
    }

    default String toFirstName() {
        sendMessage("Введите Имя: ");
        return this.scanner.nextLine();
    }

    default String input() {
        return scanner.nextLine();
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
