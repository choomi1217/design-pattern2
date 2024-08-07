package cho.ym.factory.pizzaStore.pizza.california;

import cho.ym.factory.pizzaStore.pizza.Pizza;

public class CaliforniaStylePepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing California Style Pepperoni Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking California Style Pepperoni Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting California Style Pepperoni Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing California Style Pepperoni Pizza");
    }
}
