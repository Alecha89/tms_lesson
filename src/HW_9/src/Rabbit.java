/**
 * Created by Yushko Aliaksei on 29.03.2026
 */
public class Rabbit implements Animal{
    @Override
    public void voice() {
        System.out.println("Фыр-фыр");
    }
    @Override
    public void eat(String food) {
        if (food.equals("Grass")) {
            System.out.println("Травка очень вкусная!");
        } else {
            System.out.println("Недоволен, я люблю травку!");
        }
    }
}
