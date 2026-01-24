package hospital;

public class Surgeon implements Doctor{
    @Override
    public void treat() {
        System.out.println("Делает операцию");
    }
}
