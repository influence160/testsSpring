package com.example.demo.beans;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("myobject")
public class MyObject {
	
	private boolean enabled;
	
	private String name;
	
	private List<String> listStrings;
	
	private Map<String, String> mapStrings;

	public MyObject() {
		super();
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getListStrings() {
		return listStrings;
	}

	public void setListStrings(List<String> listStrings) {
		this.listStrings = listStrings;
	}

	public Map<String, String> getMapStrings() {
		return mapStrings;
	}

	public void setMapStrings(Map<String, String> mapStrings) {
		this.mapStrings = mapStrings;
	}

	
	
}
