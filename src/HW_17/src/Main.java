/**
 * Created by Yushko Aliaksei on 02.05.2026
 *///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.time.LocalDate;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача 1:
        System.out.println("--- Задача 1 ---");
        System.out.println("Введите дату рождения (ГГГГ-ММ-ДД):");
        String birthInput = scanner.nextLine();
        LocalDate birthDate = LocalDate.parse(birthInput);
        System.out.println("100 лет вам исполнится: " + birthDate.plusYears(100));

        // Задача 2:
        System.out.println("\n--- Задача 2 ---");
        Integer[] numbers = {15, -3, 0, 7, -12, 44};
        Predicate<Integer> isPositive = x -> x > 0;
        System.out.print("Положительные числа: ");
        for (int n : numbers) {
            if (isPositive.test(n)) {
                System.out.print(n + " ");
            }
        }
        System.out.println();

        // Параметры для задач 3 и 4
        String sumByn = "130 BYN";
        double rate = 3; // Пример курса

        // Задача 3:
        System.out.println("\n--- Задача 3 ---");
        Function<String, Double> convertToUsd = s -> {
            double amount = Double.parseDouble(s.split(" ")[0]);
            return amount / rate;
        };
        System.out.println(sumByn + " в долларах: " + convertToUsd.apply(sumByn));

        // Задача 4:
        System.out.println("\n--- Задача 4 ---");
        Consumer<String> displayUsd = s -> {
            double amount = Double.parseDouble(s.split(" ")[0]);
            System.out.println("Результат Consumer: " + (amount / rate) + " USD");
        };
        displayUsd.accept(sumByn);

        // Задача 5: Supplier
        System.out.println("\n--- Задача 5 ---");
        Supplier<String> reverseInput = () -> {
            System.out.println("Введите строку для реверса:");
            String input = scanner.nextLine();
            return new StringBuilder(input).reverse().toString();
        };
        System.out.println("Строка задом наперед: " + reverseInput.get());

        scanner.close();
    }
}