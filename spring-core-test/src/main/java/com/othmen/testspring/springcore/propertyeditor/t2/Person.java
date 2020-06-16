package com.othmen.testspring.springcore.propertyeditor.t2;

import java.beans.PropertyEditorSupport;

public class Person {
	
	public static class PersonPropertyEditor extends PropertyEditorSupport {
	   
		public void setAsText(String text) throws java.lang.IllegalArgumentException {
	        String[] t = text.split("/");
	        if (t.length != 2) {
	        	throw new java.lang.IllegalArgumentException(text);
	        }
	        Person p = new Person();
	        p.setNom(t[0]);
	        p.setPrenom(t[1]);
	        setValue(p);
	    }
	    

	}
	
	private String nom;
	
	private String prenom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String toString() {
		return nom + "/" + prenom;
	}

}
