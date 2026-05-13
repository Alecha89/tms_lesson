/**
 * Created by Yushko Aliaksei on 02.05.2026
 *///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //--------------------Задача 1:
        System.out.println("---------Задача 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа через запятую (например: 1, 2, 3, 4, 4, 5):");
        String input = scanner.nextLine();

        String[] elements = input.split(",\\s*");
        Set<String> uniqueElements = new LinkedHashSet<>(Arrays.asList(elements));

        System.out.println("Результат без повторений:");
        System.out.println(String.join(", ", uniqueElements));

        //--------------------Задача 2:
        System.out.println("---------Задача 2");
        Animals name = new Animals();
        name.addAnimal("Кот");
        name.addAnimal("Собака");
        name.addAnimal("Заяц");

        name.showAnimals();

        name.removeAnimal(); // Удалит "Кот"
        name.showAnimals();

        //--------------------Задача 3:
        System.out.println("---------Задача 3");
        List<Student> studentList = new ArrayList<>();

        // Добавляем студентов
        studentList.add(new Student("Иван", "Группа-1", 1, Arrays.asList(4, 5, 4)));
        studentList.add(new Student("Олег", "Группа-2", 1, Arrays.asList(2, 3, 2)));
        studentList.add(new Student("Мария", "Группа-1", 2, Arrays.asList(5, 5, 5)));

        System.out.println("--- Список до обработки ---");
        Student.printStudents(studentList, 1);
        Student.printStudents(studentList, 2);

        // Обработка: удаление слабых и перевод остальных
        Student.processStudents(studentList);

        System.out.println("\n--- Список после обработки ---");
        // Иван теперь на 2-м курсе, Мария на 3-м, Олег удален
        Student.printStudents(studentList, 2);
        Student.printStudents(studentList, 3);
    }
}