package class_assignment1;

public class Icecream extends Dessert {
	
	protected double pricePerpiece;
	public Icecream(String flavour, int quantity) 
	{
		super(flavour, quantity);
		this.pricePerpiece = 50;
	}

	public double calculatePrice() 
	{
		return quantity * pricePerpiece;
	}

}