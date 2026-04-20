/**
 * Created by Yushko Aliaksei on 05.04.2026
 *///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User user1 = new User("Алексей", 37);
        User user2 = new User("Алексей", 37);

        System.out.println("Объект 1: " + user1);
        System.out.println("Объект 2: " + user2);

        // Сравнение через equals
        boolean isEqual = user1.equals(user2);
        System.out.println("Результат equals: " + isEqual); // Должно быть true

        // Проверка hashCode
        System.out.println("HashCode 1: " + user1.hashCode());
        System.out.println("HashCode 2: " + user2.hashCode());

    }
}