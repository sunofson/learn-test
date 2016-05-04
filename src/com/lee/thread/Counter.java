package com.lee.thread;


public class Counter {
	public int count;
	public static int count2;
	public synchronized void add(String str) {
		
		System.out.println(str + ":" + (this.count += 1));
	}
	
	public synchronized static void add2(String str) {
		System.out.println(str + ":" + (count2 += 1));
	}

}
