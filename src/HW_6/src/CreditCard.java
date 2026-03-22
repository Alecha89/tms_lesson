/**
 * Created by Yushko Aliaksei on 22.03.2026
 */
public class CreditCard {
    private String accountNumber;
    private double balance;

    // Конструктор
    public CreditCard(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Метод для начисления суммы на карту
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("На счет " + accountNumber + " внесено: " + amount);
        } else {
            System.out.println("Сумма для зачисления должна быть положительной.");
        }
    }

    // Метод для снятия суммы с карты
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Со счета " + accountNumber + " снято: " + amount);
            } else {
                System.out.println("Недостаточно средств на счете " + accountNumber);
            }
        } else {
            System.out.println("Сумма для снятия должна быть положительной.");
        }
    }

    // Метод для вывода информации о карте
    public void displayInfo() {
        System.out.println("Номер счета: " + accountNumber + ", Текущая сумма: " + balance);
    }

}
