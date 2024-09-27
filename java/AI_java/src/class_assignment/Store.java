package class_assignment;

import java.util.Scanner;

public class Store 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		Cart c = new Cart();  // object creation for cart
		String ch = "yes";
		while(true)
		{
			if(ch.equalsIgnoreCase("yes"))
			{
				System.out.println("\n******************Menu****************");
				System.out.println("Enter your choice:\n1. Candies\n2. Cookies\n3. Icecream\n");
				int choice = sc.nextInt();
				
				// Flavor input 
				System.out.println("Enter the Flavour you want: ");
				String flavour = sc.next();
				
				// Quantity input 
				System.out.println("Enter the quantity you want for particular Dessert: ");
				int quantity = sc.nextInt();
				
				switch(choice)
				{
				case 1:
					Candies cd = new Candies(flavour,quantity);
					c.addTocart(cd);
					break;
					
				case 2:
					Cookies ck = new Cookies(flavour,quantity);
					c.addTocart(ck);
					break;
					
				case 3:
					Icecream ic = new Icecream(flavour,quantity);
					c.addTocart(ic);
					break;
				}
			}
			
			System.out.println("Do you want to add more item press yes or no");
			ch = sc.next();
			if(ch.equalsIgnoreCase("no"))
			{
				break;
			}	
		}	
		c.displayBill();
	}	
}
