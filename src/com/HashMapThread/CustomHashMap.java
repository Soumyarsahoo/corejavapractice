package com.HashMapThread;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CustomHashMap extends Thread{
	static Map<Integer, String> map = new ConcurrentHashMap();

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		map.put(100,"ABC");
	}
	
	public static void main(String[] args) {
		
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		
		CustomHashMap customHashMap = new CustomHashMap();
		customHashMap.start();
		
		System.out.println(Thread.currentThread().getName());
		
		for(Object o : map.entrySet()) {
			System.out.println(o);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

}
