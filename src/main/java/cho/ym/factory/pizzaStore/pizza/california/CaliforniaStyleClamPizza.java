package cho.ym.factory.pizzaStore.pizza.california;

import cho.ym.factory.pizzaStore.pizza.Pizza;

public class CaliforniaStyleClamPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing California Style Clam Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking California Style Clam Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting California Style Clam Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing California Style Clam Pizza");
    }
}
