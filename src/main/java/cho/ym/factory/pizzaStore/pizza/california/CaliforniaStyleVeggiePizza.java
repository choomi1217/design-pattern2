package cho.ym.factory.pizzaStore.pizza.california;

import cho.ym.factory.pizzaStore.pizza.Pizza;

public class CaliforniaStyleVeggiePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing California Style Veggie Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking California Style Veggie Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting California Style Veggie Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing California Style Veggie Pizza");
    }
}
