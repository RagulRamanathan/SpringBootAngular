package com.SpringBoot.eCommerce;

public class Singleton {
	
	private int id;
	private String name;
    
	private Singleton()
	{
		
	}
	public static Singleton singleton=null;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static Singleton getInstance()
	{
		if(singleton==null)
		{
			singleton=new Singleton();
		}
		
		return singleton;
	}
   
}
