/**
 * Created by Yushko Aliaksei on 20.04.2026
 */
public class Validator {
    public static boolean checkRegistration(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        if (login == null || !login.matches("^\\S{1,19}$")) {
            throw new WrongLoginException("Логин должен быть меньше 20 символов и без пробелов.");
        }

        if (password == null || !password.matches("^(?=.*\\d)\\S{1,19}$")) {
            throw new WrongPasswordException("Пароль должен быть до 20 символов, без пробелов и с цифрой.");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают.");
        }
        return true;
    }
}
