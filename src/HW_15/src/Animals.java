/**
 * Created by Yushko Aliaksei on 02.05.2026
 */
import java.util.LinkedList;
public class Animals {
    private LinkedList<String> animals = new LinkedList<>();

    public void addAnimal(String name) {
        animals.addFirst(name); // Всегда в начало
        System.out.println("Добавлено: " + name);
    }
    public void removeAnimal() {
        if (!animals.isEmpty()) {
            String removed = animals.removeLast(); // Всегда из конца
            System.out.println("Удалено: " + removed);
        } else {
            System.out.println("Список пуст.");
        }
    }

    public void showAnimals() {
        System.out.println("Текущие животные: " + animals);
    }

}
