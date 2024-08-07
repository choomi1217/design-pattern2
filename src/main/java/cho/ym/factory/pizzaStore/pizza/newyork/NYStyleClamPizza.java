package cho.ym.factory.pizzaStore.pizza.newyork;

import cho.ym.factory.pizzaStore.pizza.Pizza;

public class NYStyleClamPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing NY Style Clam Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking NY Style Clam Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting NY Style Clam Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing NY Style Clam Pizza");
    }
}
