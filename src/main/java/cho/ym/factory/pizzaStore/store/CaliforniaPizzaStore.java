package cho.ym.factory.pizzaStore.store;

import cho.ym.factory.pizzaStore.pizza.Pizza;
import cho.ym.factory.pizzaStore.pizza.california.CaliforniaStyleCheesePizza;
import cho.ym.factory.pizzaStore.pizza.california.CaliforniaStyleClamPizza;
import cho.ym.factory.pizzaStore.pizza.california.CaliforniaStylePepperoniPizza;
import cho.ym.factory.pizzaStore.pizza.california.CaliforniaStyleVeggiePizza;

public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CaliforniaStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new CaliforniaStylePepperoniPizza();
        } else if (type.equals("clam")) {
            return new CaliforniaStyleClamPizza();
        } else if (type.equals("veggie")) {
            return new CaliforniaStyleVeggiePizza();
        }
        return null;
    }
}
