package threadInitial;

public class Notify {
    public static void main(String[] args) {
        Object lock = new Object();

        Thread producer = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Producer is producing data...");
                try {
                    lock.wait(); // Producer thread waits for consumer to notify
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Producer resumed.");
            }
        });

        Thread consumer = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Consumer is consuming data...");
                lock.notify(); // Notify the waiting producer thread
            }
        });

        producer.start();
        consumer.start();
    }
}
