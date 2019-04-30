package decorator;

public class Test {
	public static void main(String []args) {
		Beverage beverage=new Espresso();
		System.out.println(beverage.getDescriptio()+"$"+beverage.cost());
		Beverage beverage2=new HouseBlend();
		beverage2=new Mocha(beverage2);
		beverage2=new Mocha(beverage2);
		System.out.println(beverage2.getDescriptio()+"$"+beverage2.cost());
	}
}
