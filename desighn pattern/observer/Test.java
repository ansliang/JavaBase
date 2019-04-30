package observer;

public class Test {
	public static void main(String []args) {
		WeatherData weatherData=new WeatherData();
		CurrentConditionsDisplay current=new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 30);
		weatherData.setMeasurements(100, 21, 32);
	}
}
