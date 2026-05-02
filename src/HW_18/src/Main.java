/**
 * Created by Yushko Aliaksei on 02.05.2026
 *///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 7, 8, 8, 10));

        // 1. Получаем стрим из коллекции
        Stream<Integer> baseStream = numbers.stream();
        // 2. Убираем дубликаты
        Stream<Integer> distinctStream = baseStream.distinct();
        // 3. Фильтруем четные числа
        Stream<Integer> filteredStream = distinctStream.filter(n -> n % 2 == 0);
        // 4. Преобразуем в числовой стрим (IntStream)
        IntStream intStream = filteredStream.mapToInt(Integer::intValue);
        // 5. Вычисляем сумму
        int sum = intStream.sum();
        System.out.println("Сумма: " + sum);
    }
}