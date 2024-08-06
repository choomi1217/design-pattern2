package cho.ym.decorator.starbuks.decorator;

import cho.ym.decorator.starbuks.Beverage;

public abstract class Decorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}
