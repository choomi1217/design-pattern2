package cho.ym.decorator.starbuks;

public class HouseBlend extends Beverage {
    @Override
    public String getDescription() {
        return "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
