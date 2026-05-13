/**
 * Created by Yushko Aliaksei on 02.05.2026
 *///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //---------------Задачи 1
        System.out.println("Задача 1:");
        String[] words1 = {"a", "b", "a", "c", "b"};
        System.out.println(MapTasks.wordMultiple(words1)); // {a=true, b=true, c=false}

        //---------------Задачи 2
        System.out.println("Задача 2:");
        String[] words2 = {"man", "moon", "good", "night"};
        System.out.println(MapTasks.pairs(words2)); // {g=d, m=n, n=t}

    }
}