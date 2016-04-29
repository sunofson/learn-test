package com.lee.callback;

public class Restaurant {
	public boolean fireDish(Money money) {
		System.out.println("均价20元");
		if(money.getMoney() < 20) {
			System.out.println("钱不够啊!");
			return false;
		}
		
		System.out.println("菜炒好了，请品尝");
		return true;
	}
}
