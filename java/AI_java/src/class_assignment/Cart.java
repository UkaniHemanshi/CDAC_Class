package class_assignment;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	List<Dessert> cart = new ArrayList<Dessert>();
	int itemCount = 0; // Start with no items in the cart
	int total = 0;

	public void addTocart(Dessert d)
	{
	    cart.add(d); // Add the dessert to the cart
	    itemCount++; // Increment the item count
	    total += d.calculatePrice();
	    System.out.println("Item Added to cart");    		
	}
	
	public void displayBill()
	{
		System.out.println("Your added item are:\n");
		for (Dessert i : cart)
		{
			System.out.println("Flavour: "+i.flavour+"\nQuantity: "+i.quantity+"\nTotal Price: "+i.calculatePrice());
			System.out.println(" ");
		}
		System.out.println("Total bill of Item: "+ total +" , Cart have: "+ itemCount + " Item");	
	}
}
