/**
 * Created by Yushko Aliaksei on 20.04.2026
 *///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            boolean isValid = Validator.checkRegistration("myLogin", "pass1234", "pass1234");
            System.out.println("Валидация успешна: " + isValid);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}