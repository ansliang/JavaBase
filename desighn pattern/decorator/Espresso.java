package decorator;

//���
public class Espresso extends Beverage {
	
	public Espresso() {
		description="Esprosso";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.99;
	}
	
}
