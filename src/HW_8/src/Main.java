/**
 * Created by Yushko Aliaksei on 29.03.2026
 *///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kod;
        System.out.print("Введите код плана лечения: ");
        if (scanner.hasNextInt()) {
            kod = scanner.nextInt();
            Patient patient = new Patient();
            Clinic clinic = new Clinic();

            patient.setPlanLecheniya(kod);
            clinic.nameDoctor(patient);
        } else {
            System.out.println("Ошибка: введено не число. Попробуйте снова.");
            scanner.next();
        }
    }
}