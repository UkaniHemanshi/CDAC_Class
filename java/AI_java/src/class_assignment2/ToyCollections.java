package class_assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ToyCollections 
{
	public List<Toy> addToyData()  // function for add a toy into collection of list
	{
		List<Toy> toylist = new ArrayList<>();
		toylist.add(new Toy(201,"Soft Plush Toy","Educational",1328.17,2,"Jan",2023));
		toylist.add(new Toy(209,"Ride-On Toy","Battery Operated",4565.00,2,"Sep",2023));
		toylist.add(new Toy(202,"Wooden Building Blocks","Educational",2115.50,5,"Feb",2024));
		toylist.add(new Toy(207,"Remote-Controlled Car","Battery Operated",2865.50,12,"July",2023));
		toylist.add(new Toy(203,"Dinosaur Action Figure","Educational",1058.25,10,"March",2022));
		
		return toylist;
	}
	
	// 1. for printing toy collections
	public void printList(List<Toy> toylist)
	{
		for(Toy toy: toylist)
		{
			System.out.println(toy);
		}
	}
	
	// 2. filtering by category
	public List<Toy> filterCategory(List<Toy> toylist,String filterChoice)
	{
		List<Toy> filtered = new ArrayList<>();
		for(Toy toy:toylist)
		{
			if(toy.category.equalsIgnoreCase(filterChoice))
			{
				filtered.add(toy);
			}
		}
		return filtered;
	}
	
	// 4. filtering by price range
	public List<Toy> filterPrice(List<Toy> toylist,int MinRange, int MaxRange)
	{
		List<Toy> filtered = new ArrayList<>();
		for(Toy toy:toylist)
		{
			if(toy.price >= MinRange & toy.price <= MaxRange)
			{
				filtered.add(toy);
			}
		}
		return filtered;
	}
	
	// 5. List toys for a specific age
	public List<Toy> filterAge(List<Toy> toylist,int check_age)
	{
		List<Toy> filtered = new ArrayList<>();
		for(Toy toy:toylist)
		{
			int toy_age = toy.getAge();
			if(toy_age == check_age)
			{
				filtered.add(toy);
			}
		}
		return filtered;
	}
	
	// 7. Make the list of old stock [older than 1 year]
	public List<Toy> filteroldStock(List<Toy> toylist,int currentYear)
	{
		List<Toy> filtered = new ArrayList<>();
		for(Toy toy:toylist)
		{
			int toy_year = toy.getYear();
			if(toy_year < currentYear)
			{
				filtered.add(toy);
			}
		}
		return filtered;
	}
	
	// 8. Group by category
		public List<Toy> groupByCategory(List<Toy> toylist,String group_choice)
		{
			ArrayList filtered = new ArrayList<>();
			for(Toy toy:toylist)
			{
				if(toy.category.equalsIgnoreCase(group_choice))
				{
					String name = toy.getName();
					filtered.add(name);
				}
			}
			return filtered;
		}
	
	
	public static void main(String[] args) 
	{
		ToyCollections tc = new ToyCollections();
		List<Toy> toylist = tc.addToyData();
		
		// 1. List the stock 
		System.out.println("******* List the Stock of Toys *******");
		tc.printList(toylist);
		
		// 2. Filter the stock by category [e.g. Educational / Battery operated etc]
		System.out.println("******* Filter the toy collections by category of Educational / Battery operated *******");
		
		List<Toy> bycatlistof_E = tc.filterCategory(toylist,"Educational");
		tc.printList(bycatlistof_E); // print all the toy data whose category is Educational
		
//		List<Toy> bycatlistof_B = tc.filterCategory(toylist,"Battery operated");
//		tc.printList(bycatlistof_B); // print all the toy data whose category is Battery operated
		
		// 3. Search toy in the list by using binarySearch (with prod_id as key)
		System.out.println("******* Search toy by product_id *******");
		int index = Collections.binarySearch(toylist,new Toy(207,null,null,0,0,null,0));
		if(index > 0)
		{
			System.out.println("Toy Found at index: "+index);
		}
		else
		{
			System.out.println("Toy not Found !!!");
		}
		
        // 4. List Toys by price range
		System.out.println("******* List Toys by price range *******");
		List<Toy> byPriceList = tc.filterPrice(toylist,2000,3000);
		tc.printList(byPriceList);
	
		// 5. List toys for a specific age
		System.out.println("******* List toys for a specific age *******");
		List<Toy> byAgeList = tc.filterAge(toylist,2);
		tc.printList(byAgeList);
		
		// 6. Sort the toys by price, rating, prod_id
		System.out.println("******* Sort the toys by Price *******");
		toylist.sort(new PriceComparator());
		tc.printList(toylist);
		
		// 7. Make the list of old stock [older than 1 year]
		System.out.println("******* list of old stock [older than 1 year] *******");
		List<Toy> byoldStockList = tc.filteroldStock(toylist,2024);
		tc.printList(byoldStockList);
		
		
		// 8. Make a group of toys as per their category
		System.out.println("******* Make a group of toys as per their category *******");
		System.out.println("Educational: "+ tc.groupByCategory(toylist,"Educational"));  // group by Educational
		
		System.out.println("Battery operated: "+ tc.groupByCategory(toylist,"Battery operated")); // group by Battery operated
		
	}
}
