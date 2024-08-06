package cho.ym.decorator.starbuks;

public class Decaf extends Beverage {
    @Override
    public String getDescription() {
        return "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
