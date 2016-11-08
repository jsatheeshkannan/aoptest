package org.vmware.model;

import org.vmware.interfaces.Shape;

public class Circle implements Shape{
	private String name;
		
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void draw() {
		System.out.println("circle draw method");
		
	}

}
