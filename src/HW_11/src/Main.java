/**
 * Created by Yushko Aliaksei on 05.04.2026
 */

    import java.util.Arrays;
    import java.util.Comparator;
    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Найти самую короткую и длинную строки
        System.out.println("Задача 1: Введите 3 строки:");
        String[] lines1 = new String[3];
        for (int i = 0; i < 3; i++) {
            lines1[i] = scanner.nextLine();
        }

        String minLine = lines1[0];
        String maxLine = lines1[0];
        for (String line : lines1) {
            if (line.length() < minLine.length()) {
                minLine = line;
            }
            if (line.length() > maxLine.length()) {
                maxLine = line;
            }
        }
        System.out.println("Самая короткая строка: " + minLine + " (Длина: " + minLine.length() + ")");
        System.out.println("Самая длинная строка: " + maxLine + " (Длина: " + maxLine.length() + ")");

        // 2. Упорядочить строки по длине
        System.out.println("Задача 2: Введите 3 строки:");
        String[] lines2 = new String[3];
        for (int i = 0; i < 3; i++) {
            lines2[i] = scanner.nextLine();
        }
        Arrays.sort(lines2, Comparator.comparingInt(String::length));
        System.out.println("Строки в порядке возрастания длины:");
        for (String line : lines2) {
            System.out.println(line + " (Длина: " + line.length() + ")");
        }

        // 3. Вывести строки, длина которых меньше среднего
        System.out.println("Задача 3: Введите 3 строки:");
        String[] lines3 = new String[3];
        int totalLength = 0;
        for (int i = 0; i < 3; i++) {
            lines3[i] = scanner.nextLine();
            totalLength += lines3[i].length();
        }
        double averageLength = totalLength / 3.0;
        System.out.println("Строки, длина которых меньше средней (" + averageLength + "):");
        for (String line : lines3) {
            if (line.length() < averageLength) {
                System.out.println(line + " (Длина: " + line.length() + ")");
            }
        }

        // 4. Найти слово из уникальных символов
        System.out.println("Задача 4: Введите 3 строки:");
        String[] words = new String[3];
        for (int i = 0; i < 3; i++) {
            words[i] = scanner.nextLine();
        }
        String firstUniqueWord = null;
        outer:
        for (String word : words) {
            boolean isUnique = true;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (word.indexOf(c) != word.lastIndexOf(c)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                firstUniqueWord = word;
                break;
            }
        }
        if (firstUniqueWord != null) {
            System.out.println("Первое слово с уникальными символами: " + firstUniqueWord);
        } else {
            System.out.println("Нет слова из уникальных символов.");
        }

        // 5. Каждая буква задублирована
        System.out.println("Задача 5: ");
        String inputStr = scanner.nextLine();
        StringBuilder doubledStr = new StringBuilder();
        for (char c : inputStr.toCharArray()) {
            doubledStr.append(c).append(c);
        }
        System.out.println("Результат: " + doubledStr);
    }
}