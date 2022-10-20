package thread.basics;

public class ThreadStopping {
	
	//Stopping a Thread NEVER call stop() method.
	private static class Stoppable implements Runnable {
		private boolean stopRequested = false;
		
		public synchronized void requestStop() {
			this.stopRequested = true;
		}
		
		private synchronized boolean isStopRequested() {
			return this.stopRequested;
		}
		
		public void Sleep(Long millis) {
			try {
				Thread.sleep(millis);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		
		public void run() {
			System.out.println("Stoppable Running");
			
			while(!stopRequested) {
				this.Sleep(1000L);
				System.out.println("...");
			}
			
			System.out.println("Stoppable Stopped");
		}
	}
	
	public static void main(String[] args) {
		Stoppable stoppable =  new Stoppable();
		Thread t1 = new Thread(stoppable);
		t1.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("--requesting stop--");
		stoppable.requestStop(); // You need to stop it via runnable interface's method
		System.out.println("--requested stop--");
		
	}


}
