package cho.ym.strategy;

import org.junit.jupiter.api.Test;

class DuckTest {

    @Test
    void test() {
        StrategyDuck duck = new SimUDuck();
        duck.speak();
        duck.fly();
    }
}