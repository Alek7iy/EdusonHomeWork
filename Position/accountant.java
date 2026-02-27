package Position;

public class accountant implements Position{
    private String name;

    public accountant(String name){
        this.name = name;
    }

    @Override
    public void printPosition() {
        System.out.println("Должноть: Бухгалтер. Имя: " + name);
    }
}
