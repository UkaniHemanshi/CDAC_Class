package class_assignment1;

public class Candies extends Dessert {

	protected double pricePerkg;
	public Candies(String flavour, double quantity) 
	{
		super(flavour, quantity);
		this.pricePerkg = 250;
	}

	public double calculatePrice() 
	{
		return quantity * pricePerkg;
	}

}
