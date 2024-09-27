package day_4;

public class Demoobjectmethods {
	public static void main(String[] args) {
		Car car1 = new Car("dgefe","hbdfkef",50000);
		Car car2 = new Car("dfdfe","hef",50000);
		
		System.out.println(car1.equals(car2));
		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());
	}
}
