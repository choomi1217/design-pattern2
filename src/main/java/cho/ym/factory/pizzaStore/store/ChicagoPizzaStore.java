package cho.ym.factory.pizzaStore.store;

import cho.ym.factory.pizzaStore.pizza.*;
import cho.ym.factory.pizzaStore.pizza.chicago.ChicagoStyleCheesePizza;
import cho.ym.factory.pizzaStore.pizza.chicago.ChicagoStyleClamPizza;
import cho.ym.factory.pizzaStore.pizza.chicago.ChicagoStylePepperoniPizza;
import cho.ym.factory.pizzaStore.pizza.chicago.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else if (type.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        }
        return null;
    }
}
