package decorator;


//具体装饰类
public class Mocha extends CondimentDecorator{
	
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage=beverage;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescriptio()+" , Mocha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.2+beverage.cost();
	}
	

}
