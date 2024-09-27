package class_assignment;

public abstract class Dessert {
	
	protected String flavour;
	protected double quantity;

	
	public Dessert(String flavour, double quantity) 
	{
		this.flavour = flavour;
		this.quantity = quantity;
	}

	public abstract double calculatePrice();
	
	
}
