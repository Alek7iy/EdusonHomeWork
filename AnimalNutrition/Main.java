package AnimalNutrition;

public class Main {
    public static void main(String[] args){
        Animal Dog = new Dog("Шарик ");
        Animal Tiger = new Tiger("Лев ");
        Animal Rabbit = new Rabbit("Банни ");

        System.out.println("Как говорят животные:");
        Dog.voice();
        Tiger.voice();
        Rabbit.voice();

        System.out.println("Что едят животные:");
        Dog.eat("Meat");
        Dog.eat("Grass");
        Tiger.eat("Meat");
        Tiger.eat("Grass");
        Rabbit.eat("Meat");
        Rabbit.eat("Grass");



    }
}
