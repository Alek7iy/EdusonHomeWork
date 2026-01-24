package Position;

class director implements Position  {
    private String name;

    public director(String name){
    this.name = name;
    }

    @Override
    public void printPosition(){
        System.out.println("Должность: Директор. Имя: " + name);
    }
}
