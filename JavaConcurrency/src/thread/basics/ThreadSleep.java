package thread.basics;

public class ThreadSleep {
	
	public static void main(String[] args) {
		Runnable run = () -> {
			System.out.println(Thread.currentThread().getName()+" is running");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			System.out.println(Thread.currentThread().getName()+" is stopping");
		};
		
		Thread thread = new Thread(run,"Sleeping Thread");
		thread.start();
		
		
	}

}




