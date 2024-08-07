package cho.ym.factory.pizzaStore.store;

import cho.ym.factory.pizzaStore.pizza.Pizza;
import cho.ym.factory.pizzaStore.pizza.newyork.NYStyleCheesePizza;
import cho.ym.factory.pizzaStore.pizza.newyork.NYStyleClamPizza;
import cho.ym.factory.pizzaStore.pizza.newyork.NYStylePepperoniPizza;
import cho.ym.factory.pizzaStore.pizza.newyork.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        }
        return null;
    }
}
