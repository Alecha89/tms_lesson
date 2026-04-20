/**
 * Created by Yushko Aliaksei on 20.04.2026
 *///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.*;
import java.nio.file.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Пути к файлам
        String inputPath = "D:\\Леша\\java project\\tms_lesson\\src\\HW_14\\Ромео и Джульетта.txt";
        String outputPath = "D:\\Леша\\java project\\tms_lesson\\src\\HW_14\\result.txt";

        try {
            // Читаем все строки из файла
            String content = Files.readString(Paths.get(inputPath));

            // Разбиваем текст на слова, убирая лишние знаки препинания
            // Регулярное выражение \\P{L}+ найдет всё, что не является буквой
            String longestWord = Arrays.stream(content.split("\\P{L}+"))
                    .max(Comparator.comparingInt(String::length))
                    .orElse("");

            // Записываем результат в новый файл
            Files.writeString(Paths.get(outputPath), "Самое длинное слово: " + longestWord);

            System.out.println("Готово! Самое длинное слово записано в: " + outputPath);
            System.out.println("Результат: " + longestWord);

        } catch (IOException e) {
            System.err.println("Произошла ошибка при работе с файлом: " + e.getMessage());
        }
    }
}