package cho.ym.factory.pizzaStore.pizza.chicago;

import cho.ym.factory.pizzaStore.pizza.Pizza;

public class ChicagoStyleVeggiePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Chicago Style Veggie Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Chicago Style Veggie Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Chicago Style Veggie Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing Chicago Style Veggie Pizza");
    }
}
