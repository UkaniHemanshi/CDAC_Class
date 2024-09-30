package class_assignment2;

import java.util.Comparator;

// Function interface
public class PriceComparator implements Comparator<Toy>
{
	public int compare(Toy o1, Toy o2) {
		if(o1.getPrice() < o2.getPrice())
			return -1;
		else
			return 1;
	}
}
