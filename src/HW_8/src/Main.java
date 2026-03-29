/**
 * Created by Yushko Aliaksei on 29.03.2026
 *///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Patient patient = new Patient();
        Clinic clinic = new Clinic();

        patient.setPlanLecheniya(1);
        clinic.nameDoctor(patient);

        patient.setPlanLecheniya(2);
        clinic.nameDoctor(patient);

        patient.setPlanLecheniya(9);
        clinic.nameDoctor(patient);

    }
}