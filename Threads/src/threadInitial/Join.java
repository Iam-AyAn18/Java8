package threadInitial;

public class Join extends Thread {
    public void run() {
        System.out.println("Thread is running.");
        try {
            Thread.sleep(2000); // Simulating some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread completed.");
    }

    public static void main(String[] args) {
        Join myThread = new Join();
        myThread.start();

        try {
            myThread.join(); // Main thread waits for myThread to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread resumed.");
    }
}
