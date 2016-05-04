package com.lee.thread;
/**
 * 测试 普通方法枷锁和静态方法加锁
 * @author UCMED
 *
 */

public class CounterThread extends Thread {

	protected Counter counter = null;

	public CounterThread(Counter counter) {
		this.counter = counter;
	}

	@Override
	public void run() {

		/*
		 * for(int i = 0; i < 10; i++) { counter.add(i, this.getName()); }
		 */
		for (int i = 0; i < 10; i++) {
			Counter.add2(this.getName());
		}
	}

	public static void main(String[] args) {
		/*
		 * Counter counter = new Counter(); Thread t1 = new
		 * CounterThread(counter); Thread t2 = new CounterThread(counter);
		 * t1.start(); t2.start();
		 */

		/*
		 * Thread t1 = new CounterThread(new Counter()); Thread t2 = new
		 * CounterThread(new Counter()); t1.start(); t2.start();
		 */

		/*Counter counter = new Counter();
		Thread t1 = new CounterThread(counter);
		Thread t2 = new CounterThread(counter);
		t1.start();
		t2.start();*/
		
		
		 Thread t1 = new CounterThread(new Counter()); 
		 Thread t2 = new CounterThread(new Counter()); 
		 t1.start(); 
		 t2.start();
		 

	}
}
