package Position;

public class Demo {
    public static void main(String[] args) {
        Position director = new director("Алекс");
        Position worker = new worker("Дэвид");
        Position accountant = new accountant("Марк");

        director.printPosition();
        worker.printPosition();
        accountant.printPosition();

    }
}
