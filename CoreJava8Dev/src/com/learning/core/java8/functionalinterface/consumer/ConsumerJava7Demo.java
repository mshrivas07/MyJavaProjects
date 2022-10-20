package com.learning.core.java8.functionalinterface.consumer;

import java.util.function.Consumer;

public class ConsumerJava7Demo implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		// TODO Auto-generated method stub
		System.out.println("print:"+t);
	}
	
	
	public static void main(String[] args) {
		ConsumerJava7Demo consumer = new ConsumerJava7Demo();
		consumer.accept(19);
	}
	

}
