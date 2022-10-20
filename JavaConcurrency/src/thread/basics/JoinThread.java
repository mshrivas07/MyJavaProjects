package thread.basics;

public class JoinThread {
	
	public static void main(String[] args) {
		Thread t1 = new Thread(()->{
			for(int i = 0; i < 5; i++) {
				sleep(1000);
				System.out.println("running");
			}
		});
		t1.setDaemon(true);
		t1.start();
		
		//Without below join() method main thread will not wait for t1 to complete
        //try commentting below try catch block to see the results
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("End");
	}
	
	public static void sleep(long ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
