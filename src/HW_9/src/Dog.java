/**
 * Created by Yushko Aliaksei on 29.03.2026
 */
public class Dog implements Animal{
    @Override
    public void voice() {
        System.out.println("Гав");
    }
    @Override
    public void eat(String food) {
        if (food == "Feed") {
            System.out.println("Я люблю корм!");
        } else {
            System.out.println("Недоволен, я люблю корм!");
        }
    }
}
