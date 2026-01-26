package hospital;

public class Main {
    public static void main(String[] args) {
        Therapist therapist = new Therapist();

        Patient patient1 = new Patient(1);
        Patient patient2 = new Patient(2);
        Patient patient3 = new Patient(3);


        System.out.println("Лечения пациента");


        therapist.assignDoctor(patient1);
        System.out.println();


        therapist.assignDoctor(patient2);
        System.out.println();


        therapist.assignDoctor(patient3);
    }
}