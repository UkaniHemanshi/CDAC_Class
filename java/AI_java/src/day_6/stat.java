package day_6;

public class stat<T extends Number> // T is sub type of Number that's why we write extends
{
	T[] num;
	public void setValues(T[] num)
	{
		this.num = num ;
	}
	public double getAverage()
	{
	    double sum = 0;
		for(int i = 0; i<num.length; i++)
		{
			sum += num[i].doubleValue();
		}
		return sum / num.length;
	}
	
	public static void main(String[] args) {
		Integer [] arr = {1,2,3,4,5};
		stat<Integer> stat1 = new stat<>();
		stat1.setValues(arr);
		System.out.println(stat1.getAverage());
		
		Double [] arr1 = {1.1,2.2,3.3,4.4,5.5};
		stat<Double> stat2 = new stat<>();
		stat2.setValues(arr1);
		System.out.println(stat2.getAverage());
		
		
	}
}
