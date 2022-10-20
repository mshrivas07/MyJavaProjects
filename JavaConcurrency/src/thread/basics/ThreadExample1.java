package thread.basics;

public class ThreadExample1 {

	public static void main(String[] args) {
		//Create thread by extending Thread class
		MyThread thread1 = new MyThread();
		thread1.start();
		//Create thread by implementing Runnable
		Thread thread2 = new Thread(new MyRunnableThread(),"Runnable");
		thread2.start();
		//Creating Thread by Runnable anonymous method
		Runnable runnable =  new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+" is running");
				System.out.println(Thread.currentThread().getName()+" is stopping");
			}
		};
		Thread thread3 = new Thread(runnable,"Anonymous runnable");
		thread3.start();
		//Creating thread using Lambda
		Runnable runnable1 = () -> {
			System.out.println(Thread.currentThread().getName()+" is running");
			System.out.println(Thread.currentThread().getName()+" is stopping");
		};
		Thread thread4 = new Thread(runnable1,"Lamda Thread");
		thread4.start();
	}
	
	private static class MyThread extends Thread{
		public void run() {
			System.out.println(Thread.currentThread().getName()+" Thread class is running");
			System.out.println(Thread.currentThread().getName()+" Thread class is stopping");
		}
		
	}
	
	private static class MyRunnableThread implements Runnable{

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName()+" is running");
			System.out.println(Thread.currentThread().getName()+" is stopping");
		}
		
	}
}
