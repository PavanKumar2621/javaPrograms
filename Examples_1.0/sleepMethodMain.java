/* "SLEEP METHOD" - It makes the current thread in the wait state for specific period of 
 time */
// Program to demonstrate SLEEP method

public class sleepMethodMain {
   public static void main(String[] args) {
      myThread m = new myThread();
      m.start();
      for(int i=0;i<10;i++) {
		System.out.println("Main Thread");
		}
	}
}

class myThread extends Thread {
      public void run() {
             for(int i=0;i<10;i++) {
		System.out.println("Child Thread");
		}
          try {
		sleep(1000);
              }
           catch(InterruptedException e) {
               System.out.println(e.getMessage());
              }
       }
}