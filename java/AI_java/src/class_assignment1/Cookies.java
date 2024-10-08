package class_assignment1;

public class Cookies extends Dessert {
	
	protected double pricePerdozen;
	public Cookies(String flavour, int quantity) 
	{
		super(flavour, quantity);
		this.pricePerdozen = 300;
	}

	public double calculatePrice() 
	{
		return quantity * pricePerdozen;
	}

}