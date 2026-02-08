package AnimalNutrition;

public class Rabbit extends Animal{
    public Rabbit(String name){
        super(name);
    }
    @Override
    public void voice() {
        System.out.println(name + "*пищит*");
    }

    @Override
    public void eat(String food){
        if ("Grass".equals(food)) {
            System.out.println(name + "любит есть траву");
        }else {
            System.out.println(name + "не любит есть мясо");
        }
    }
}

