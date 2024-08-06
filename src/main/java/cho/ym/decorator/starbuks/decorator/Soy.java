package cho.ym.decorator.starbuks.decorator;

import cho.ym.decorator.starbuks.Beverage;

public class Soy extends Decorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .15;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
