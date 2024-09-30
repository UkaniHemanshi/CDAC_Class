package class_assignment2;


public class Toy implements Comparable<Toy>
{
	protected int product_id;
	protected String name;
	protected String category;
	protected double price;
	protected int age;
	protected String purchase_month;
	protected int year;
	
	public Toy(int product_id, String name, String category, double price, int age, String purchase_month, int year) {
		super();
		this.product_id = product_id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.age = age;
		this.purchase_month = purchase_month;
		this.year = year;
	}
	
	// Getter and Setter 
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

	@Override
	public String toString() {
		return "Toy_Data:\nproduct_id = " + product_id + "\nname = " + name + "\ncategory = " + category + "\nprice = " + price
				+ "\nage = " + age + "\npurchase_month = " + purchase_month + "\nyear = " + year + "\n";
	}

	@Override
	public int compareTo(Toy o) {
		return this.product_id - o.product_id;
	}	
}
