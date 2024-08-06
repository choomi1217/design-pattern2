package cho.ym.decorator.starbuks.decorator;

import cho.ym.decorator.starbuks.Beverage;

public class Whip extends Decorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
