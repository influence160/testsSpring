package com.othmen.testspring.springcore.propertyeditor.t1;

import java.beans.PropertyEditorSupport;

public class Animal {
	
	public static class AnimalPropertyEditor extends PropertyEditorSupport {
		
		   public void setAsText(String text) throws java.lang.IllegalArgumentException {
		        String[] t = text.split("/");
		        if (t.length != 2) {
		        	throw new java.lang.IllegalArgumentException(text);
		        }
		        Animal a = new Animal();
		        a.setType(t[0]);
		        a.setName(t[1]);
		        setValue(a);
		    }
	}
	
	private String type;
	private String name;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return type + "/" + name;
	}

}
