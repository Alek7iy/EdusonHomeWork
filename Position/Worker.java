package Position;

class worker implements Position {
    private String name;

    public worker(String name) {
    this.name = name;
    }

    @Override
    public void printPosition() {
        System.out.println("Должность: Рабочий. Имя: " + name);
    }
}
