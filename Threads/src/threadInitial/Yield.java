package threadInitial;

public class Yield extends Thread {
	static Integer k=0;
    public void run() {
    	for (int i = 0; i < 5; i++) {
    		k++;
        	Thread.yield();
        	  for (int j = 0; j < 10; j++)
        	  {
        		  System.out.println(Integer.toString(k)+Integer.toString(i)+Integer.toString(j));
        	  }
        }
    }

    public static void main(String[] args) {
    	Yield myThread = new Yield();
        myThread.start();
        
        Yield myThread2 = new Yield();
        myThread2.start();
    }
}