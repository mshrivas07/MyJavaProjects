package thread.basics;

public class DaemonThreadExample {
	
	public static void main(String[] args) {
		Runnable runnable = () -> {
			while(true) {
				sleep(1000);
				System.out.println("Running");
			}
		};
		
		Thread t1 = new Thread(runnable);
		//if you comment this line t1 thread will continue running JVM even after main() is completed 
		//hence will behave as a background thread or daemon thread
		// in order to kill all the threads we need to set t1 as Daemon threads
		// Garabage collector is a Daemon thread too
		t1.setDaemon(true);//Note that Daemon threads are terminated in undefined state so we should be careful while terminating them
		t1.start();
		sleep(3000);
		System.out.println("stopping Main");
	}
	
	public static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
