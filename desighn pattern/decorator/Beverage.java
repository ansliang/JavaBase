package decorator;

public abstract class Beverage {
	String description="Unkonwn Beverage";
	
	public String getDescriptio() {
		return description;
	}
	public abstract double cost();
}
