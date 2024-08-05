package cho.ym.observer;

import cho.ym.observer.observer.display.CurrentConditionDisplay;
import cho.ym.observer.observer.display.ForecastDisplay;
import cho.ym.observer.observer.display.StatisticsDisplay;
import cho.ym.observer.subject.WeatherData;
import org.junit.jupiter.api.Test;

class ObserverTest {

    @Test
    void testObserver() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }

}