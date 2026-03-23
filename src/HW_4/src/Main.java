/**
 * Created by Yushko Aliaksei on 15.03.2026
 */
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод размера массива
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        // Выбор метода заполнения
        System.out.println("Выберите способ заполнения массива:");
        System.out.println("1. С помощью Math.random()");
        System.out.println("2. Ввод с клавиатуры");
        int choice = scanner.nextInt();


        if (choice == 1) {
            for (int i = 0; i < size; i++) {
                array[i] = (int)(Math.random() * 100); // число от 0 до 99
            }
        } else if (choice == 2) {
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                System.out.print("Элемент " + i + ": ");
                array[i] = scanner.nextInt();
            }
        } else {
            System.out.println("Некорректный выбор. Используем способ 1 по умолчанию.");
            for (int i = 0; i < size; i++) {
                array[i] = (int)(Math.random() * 100);
            }
        }
        System.out.println("Изначальный массив: " + Arrays.toString(array));

        // --------------------Задача 1:
        // Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
        {
            System.out.println("Задача 1: Элементы в прямом порядке: " + Arrays.toString(array));
            System.out.print("Обратный порядок: ");
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }

        // --------------------Задача 2:
        // Найти минимальный-максимальный элементы и вывести в консоль.

        int min = array[0], max = array[0];
        for (int num : array) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        System.out.println("Задача 2: Минимальный элемент: " + min);
        System.out.println("Задача 2: Максимальный элемент: " + max);

        // --------------------Задача 3:
        // Найти индексы минимального и максимального элементов и вывести в консоль.

        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) minIndex = i;
            if (array[i] > array[maxIndex]) maxIndex = i;
        }
        System.out.println("Задача 3: Индекс минимального элемента: " + minIndex);
        System.out.println("Задача 3: Индекс максимального элемента: " + maxIndex);

        // --------------------Задача 4:
        // Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
        //сообщение, что их нет.

        int zeroCount = 0;
        for (int num : array) {
            if (num == 0) zeroCount++;
        }
        if (zeroCount > 0) {
            System.out.println("Задача 4: Количество нулевых элементов: " + zeroCount);
        } else {
            System.out.println("Задача 4: Нулевых элементов нет");
        }

        // --------------------Задача 5:
        // Пройти по массиву и поменять местами элементы первый и последний, второй и
        //предпоследний и т.д.

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println("Задача 5: Массив после обмена местами: " + Arrays.toString(array));

        // --------------------Задача 6:
        // Проверить, является ли массив возрастающей последовательностью (каждое следующее
        //число больше предыдущего).

        boolean isAscending = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                isAscending = false;
                break;
            }
        }
        if (isAscending) {
            System.out.println("Задача 6: Массив является возрастающей последовательностью");
        } else {
            System.out.println("Задача 6: Массив не является возрастающей последовательностью");
        }

        // -----------------Задача *:
        // Имеется массив из неотрицательных чисел(любой). Представьте что массив
        //представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
        //добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
        //содержит нуля в начале, кроме самого числа 0.

        scanner.close();
    }

}