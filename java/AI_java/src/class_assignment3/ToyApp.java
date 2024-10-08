package class_assignment3;

public class ToyApp 
{
	private int product_id;
	private String name;
	private String category;
	private double price;
	private int age;
	private String purchase_month;
	private int year;
	
	// constructor
	public ToyApp(int product_id, String name, String category, double price, int age, String purchase_month,
			int year) {
		super();
		this.product_id = product_id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.age = age;
		this.purchase_month = purchase_month;
		this.year = year;
	}

	//getter and setter
	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPurchase_month() {
		return purchase_month;
	}

	public void setPurchase_month(String purchase_month) {
		this.purchase_month = purchase_month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	//to string 
	public String toString() {
		return "Toy_Data : product_id = " + product_id + " , name = " + name + " , category = " + category + " , price = " + price
				+ " , age = " + age + " , purchase_month = " + purchase_month + " , year = " + year +"\n" ;
	}
}
