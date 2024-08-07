package cho.ym.factory.pizzaStore.pizza.california;

import cho.ym.factory.pizzaStore.pizza.Pizza;

public class CaliforniaStyleCheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing California Style Cheese Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking California Style Cheese Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting California Style Cheese Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing California Style Cheese Pizza");
    }
}
