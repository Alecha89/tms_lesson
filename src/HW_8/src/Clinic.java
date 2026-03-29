/**
 * Created by Yushko Aliaksei on 29.03.2026
 */
public class Clinic {
    public void nameDoctor(Patient patient) {
        switch (patient.planLecheniya) {
            case 1:
                patient.setDoctor(new Surgeon());
                break;
            case 2:
                patient.setDoctor(new Dantist());
                break;
            default:
                patient.setDoctor(new Terapist());
        }
        patient.doctor.treat();
    }
}
