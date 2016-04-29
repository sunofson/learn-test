package com.lee.design.model;

/**
 * 懒汉式单例模式, 它是线程不安全的
 * @author UCMED
 *
 */
public class LazySingleton {
	private LazySingleton(){}
	private static LazySingleton singleton;
	
	public static LazySingleton getInstance() {
		if(singleton == null) {
			singleton = new LazySingleton();
		}
		
		return singleton;
	}
	
}
