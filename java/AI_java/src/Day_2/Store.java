package Day_2;

import java.util.Scanner;

public class Store {
	public static void main(String[] args) {
		Flavour flavour = Flavour.CHOCOLATE;
		
		switch(flavour)
		{
		case CHOCOLATE:
			System.out.println("You have selected "+ flavour);
			break;
		case MINT:
			System.out.println("You have selected "+ flavour);
			break;
		case CREAM:
			System.out.println("You have selected "+ flavour);
			break;
		}
		
		System.out.println("******************Menu****************");
		Flavour[] menu = Flavour.values();
		for(Flavour m:menu)
		{
			System.out.println(m);
		}
		System.out.println("Enter the flavour: ");
		Scanner sc = new Scanner(System.in);
		String choice = sc.next();
		Flavour f = Flavour.valueOf(choice.toUpperCase());
		System.out.println("Selected flavour: "+ f);
		System.out.println("Price for selected flavour: "+f.getprice());
		
	}

}
