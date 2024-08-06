package cho.ym.decorator.starbuks.decorator;

import cho.ym.decorator.starbuks.Beverage;

public class Mocha extends Decorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
