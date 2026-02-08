package AnimalNutrition;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
        @Override
        public void voice () {
            System.out.println(name + "гав-гав");
        }

        @Override
        public void eat(String food){
            if ("Meat".equals(food)) {
                System.out.println(name + "любит есть мясо");
            }else {
                System.out.println(name + "не любит есть  траву");
            }
        }
    }
