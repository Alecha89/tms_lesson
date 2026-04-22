/**
 * Created by Yushko Aliaksei on 20.04.2026
 *///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\b[A-ZА-ЯЁ]{2,6}\\b");
        Matcher matcher = pattern.matcher(input);

        System.out.println("Найденные аббревиатуры:");
        boolean found = false;
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        if (!found) {
            System.out.println("Аббревиатуры не найдены.");
        }

    }
}