/**
 * Created by Yushko Aliaksei on 16.03.2026
 *///TIP Чтобы <b>запустить</b> код, нажмите <shortcut actionId="Run"/> или
// нажмите на значок <icon src="AllIcons.Actions.Execute"/> на полях.
public class Main {
    public static void main(String[] args) {
        // Создаем три объекта CreditCard с номерами и начальными суммами
        CreditCard card1 = new CreditCard("1234567890", 1000);
        CreditCard card2 = new CreditCard("0987654321", 2000);
        CreditCard card3 = new CreditCard("1122334455", 3000);

        // Тестируем операции согласно сценарию
        card1.deposit(100);         // Положить деньги на первую карту
        card2.deposit(200);        // Положить деньги на вторую карту
        card3.withdraw(300);       // Снять деньги с третьей карты

        // Выводим текущее состояние всех трех карточек
        card1.displayInfo();
        card2.displayInfo();
        card3.displayInfo();

    }
}