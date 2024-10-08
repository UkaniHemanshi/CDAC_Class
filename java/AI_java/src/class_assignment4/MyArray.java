package class_assignment4;

public class MyArray implements Runnable {
    private char[] greeting;
    private int start;
    private int end;

    public MyArray(char[] greeting, int start, int end) {
        this.greeting = greeting;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            System.out.print(greeting[i]);
        }
    }

    public static void main(String[] args) {
        char[] greeting = {'G', 'o', 'o', 'd', ' ', 'M', 'o', 'r', 'n', 'i', 'n', 'g'};

        // Create two threads to print the character array
        Thread thread1 = new Thread(new MyArray(greeting, 0, greeting.length / 2));
        Thread thread2 = new Thread(new MyArray(greeting, greeting.length / 2, greeting.length));

        // Start the threads
        thread1.start();
        thread2.start();

        try {
            // Wait for both threads to finish
        	Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(); // Print a newline after the threads finish
    }
}
