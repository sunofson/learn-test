package com.lee.callback;

public class Customer {
	public static void main(String[] args) {
		Restaurant res = new Restaurant();
		res.fireDish(new Money(){
			@Override
			public float getMoney() {
				System.out.println("顾客付钱了");
				return 19;
			}
		});
	}
}
