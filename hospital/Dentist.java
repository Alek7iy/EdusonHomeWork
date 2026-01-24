package hospital;

public class Dentist implements Doctor{

    @Override
    public void treat() {
        System.out.println("Лечит зубы");
    }
}
