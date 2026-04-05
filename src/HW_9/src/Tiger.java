/**
 * Created by Yushko Aliaksei on 29.03.2026
 */
public class Tiger implements Animal{
    @Override
    public void voice() {
        System.out.println("Ррр");
    }

    @Override
    public void eat(String food) {
        if (food.equals("Meet")) {
            System.out.println("Я люблю мясо!");
        } else {
            System.out.println("Недоволен, я люблю мясо!");
        }
    }
}
