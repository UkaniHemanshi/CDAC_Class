package day_4;

public interface Writable {
	void write();
	default void foo() {
		System.out.println("This is default functionality");
	}
}
