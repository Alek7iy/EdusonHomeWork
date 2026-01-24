package hospital;

public class Therapist implements Doctor {
    @Override
    public void treat() {
        System.out.println("Даёт рекомендации");
    }
    public void assignDoctor(Patient patient) {
        int treatmentCode = patient.getTreatmentPlan();

        Doctor doctor;
        switch (treatmentCode) {

            case 1:
                doctor = new Surgeon();
                System.out.println("Назначен хирург");
                break;

            case 2:
                doctor = new Dentist();
                System.out.println("Назначен дантист");
                break;

            default:
                doctor = this;
                System.out.println("Назначен терапевт");
        }
        patient.setDoctor(doctor);
        patient.getDoctor().treat();
    }
}
