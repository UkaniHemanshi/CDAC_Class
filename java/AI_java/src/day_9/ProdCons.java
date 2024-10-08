package day_9;

public class ProdCons 
{
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		Thread producer = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					queue.setValue(i);
					try {
						Thread.sleep(100);
					}catch (InterruptedException e) {
		                e.printStackTrace();
					}
				}
			}
		});
		
		Thread consumer = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					queue.getValue();
					try {
						Thread.sleep(100);
					}catch (InterruptedException e) {
		                e.printStackTrace();
					}
				}
			}
		});
		
		producer.start();
		consumer.start();
		}
}
