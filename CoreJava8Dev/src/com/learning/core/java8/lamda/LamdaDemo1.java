package com.learning.core.java8.lamda;

interface Calc {
	int sumUp(int a, int b);
}

public class LamdaDemo1 {

	public static void main(String[] args) {

		// Instead of doing implementation following way
//		@Override
//		public void sumUp() {
//			// TODO Auto-generated method stub
//			
//		}	

		// We can do Anonymous method call
		Calc calc = (a, b) -> { //If you have a business logic like if else use curly braces like below
			if(a>b) {
			 return a + b;
			}else {
				return a;
			}
		};

		int x = calc.sumUp(3, 14);
		
//		more optimized version if there is no complex if else logic
		Calc calc2 = (a,b) -> a+b;
		
		int y = calc.sumUp(3, 14);

		// Another common approach is this
		Runnable runnable = () -> System.out.println("Hi Java ".concat(String.valueOf(x)));
		runnable.run();
		Runnable runnable2 = () -> System.out.println("Hello Java ".concat(String.valueOf(y)));
		runnable2.run();
	}
}
