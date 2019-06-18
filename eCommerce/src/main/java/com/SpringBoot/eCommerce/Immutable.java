package com.SpringBoot.eCommerce;

public final class Immutable {
	
	final private int id;
	final private String name;
	public Immutable(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	

}
