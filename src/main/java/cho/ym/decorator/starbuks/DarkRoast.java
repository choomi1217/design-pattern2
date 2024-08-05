package cho.ym.decorator.starbuks;

public class DarkRoast implements Beverage {
    @Override
    public String getDescription() {
        return "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
