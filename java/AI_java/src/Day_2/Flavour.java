package Day_2;

public enum Flavour {
	CHOCOLATE(120),MINT(90),CREAM(90);
	
	int price;
	private Flavour(int price)
	{
		this.price = price;
	}
	public int getprice()
	{
		return price;
	}
}
