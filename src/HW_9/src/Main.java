/**
 * Created by Yushko Aliaksei on 29.03.2026
 *///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal rabbit = new Rabbit();
        Animal dog = new Dog();
        Animal tiger = new Tiger();

        rabbit.voice();
        rabbit.eat("Grass");
        rabbit.eat("Meat");

        dog.voice();
        dog.eat("Feed");
        dog.eat("Grass");

        tiger.voice();
        tiger.eat("Meet");
        tiger.eat("Feed");
    }
}