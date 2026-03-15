/**
 * Created by Yushko Aliaksei on 15.03.2026
 */
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //--------------------Задача 1:
        System.out.println("---------Задача 1");
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int rows = 2;
        int cols = 2;
        int[][] array = new int[rows][cols];

        // -------------------1.1.
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = rand.nextInt(100);
            }
        }
        System.out.println("Исходный массив:");
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }

        // -------------------1.2.
        System.out.print("Введите число, которое нужно добавить к каждому элементу: ");
        int addValue = scanner.nextInt();

        // -------------------1.3.
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] += addValue;
                sum += array[i][j];
            }
        }

        System.out.println("Обновленный массив:");
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
        System.out.println("Сума всех элементов: " + sum);

        //--------------------Задача 2:
        System.out.println("---------Задача 2");
        String[][] board = new String[8][8];

        // Заполнение массива
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    board[i][j] = "W"; // белая клетка
                } else {
                    board[i][j] = "B"; // чёрная клетка
                }
            }
        }
        // Вывод доски
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        //--------------------Задача 3*:
        System.out.println("---------Задача 3");
        System.out.print("Введите n: ");
        int n = scanner.nextInt();

        System.out.print("Введите m: ");
        int m = scanner.nextInt();

        int[][] array3 = new int[n][m];

        int value = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) { // четная строка — слева направо
                for (int j = 0; j < m; j++) {
                    array3[i][j] = value++;
                }
            } else { // нечетная строка — справа налево
                for (int j = m - 1; j >= 0; j--) {
                    array3[i][j] = value++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%3d", array3[i][j]);
            }
            System.out.println();
        }

    }
}