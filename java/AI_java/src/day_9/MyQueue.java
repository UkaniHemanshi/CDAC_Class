package day_9;

public class MyQueue {
	int value;
	boolean hasvalue = false;
	
	public synchronized void setValue(int value) {
		if(hasvalue) {
			try {
				wait();
			}catch (InterruptedException e) {
                e.printStackTrace();
		}
	}
		
		this.value = value;
		hasvalue = true;
		notify();
		System.out.println("Set value : "+value);
		
	}
	public synchronized void getValue() {
		while(!hasvalue) {
			try {
				wait();
			}catch (InterruptedException e) {
                e.printStackTrace();
			}
		}
		hasvalue = false;
		notify();
		System.out.println("Got Value : "+value);
	}

}
