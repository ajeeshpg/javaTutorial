package com.ajeesh.desingpatterns;

import java.io.Serializable;

public class SingleTon implements Serializable, Cloneable{
	
	private SingleTon(){
		System.out.println("Inside SingleTon Constructor");
	}
	
	private static class SingletonHolder{
		
		
		private static final SingleTon SINGLETON = new SingleTon();
		
		
	}
	
	public static SingleTon getInstance(){
		System.out.println("Inside getInstance");
		return SingletonHolder.SINGLETON;
	}
	
	public Object Clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}

}
