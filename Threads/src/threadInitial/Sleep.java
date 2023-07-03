package threadInitial;

public class Sleep {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                System.out.println("Thread is sleeping...");
                Thread.sleep(2000); // Sleep for 2 seconds
                System.out.println("Thread woke up.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread.start();
    }
}
