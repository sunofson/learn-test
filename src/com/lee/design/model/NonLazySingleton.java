package com.lee.design.model;

/**
 * 饿汉式单例模式,它是线程安全的
 * @author UCMED
 *
 */
public class NonLazySingleton {
	private NonLazySingleton() {}
	private static final NonLazySingleton singleton = new NonLazySingleton();
	
	public static NonLazySingleton getInstantce() {
		return singleton;
	}
}
