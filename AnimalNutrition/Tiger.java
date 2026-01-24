package AnimalNutrition;

public class Tiger extends Animal {
    public Tiger(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println(name + "р-р-р");
    }

    @Override
        public void eat (String food){
            if ("Meat".equals(food)) {
                System.out.println(name + "любит есть мясо");
            } else {
                System.out.println(name + "не любит есть траву");
            }
        }
    }
