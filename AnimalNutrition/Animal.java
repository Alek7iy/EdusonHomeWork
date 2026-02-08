package AnimalNutrition;

public abstract class Animal {
    public String name;

    public Animal(String name){
        this.name = name;
    }
    public abstract void voice();
    public abstract void eat(String food);
}
