package observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
	private ArrayList observers;
	private float temperate;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers=new ArrayList();
	}
	
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i=observers.indexOf(o);
		if (i>=0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyPbservers() {
		// TODO Auto-generated method stub
		for (int i=0;i<observers.size();i++) {
			Observer observer=(Observer)observers.get(i);
			observer.update(temperate, humidity, pressure);
		}
	}
	
	public void measurementChanged() {
		notifyPbservers();
	}
	
	public void setMeasurements(float temperatre,float humidity,float pressure) {
		this.temperate=temperate;
		this.humidity=humidity;
		this.pressure=pressure;
		measurementChanged();
	}

}
