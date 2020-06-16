package com.othmen.testspring.springcore.resources.p1.p2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
public class Bean2 {
	
	@Value("resources/resource1.txt")
	private Resource resource1;
	@Value("classpath*:resource2.txt")
	private Resource resource2;
	@Value("classpath*:com/**/resource3.txt")
	private Resource resource3;
	
	public Resource getResource1() {
		return resource1;
	}
//	public void setResource1(Resource resource1) {
//		this.resource1 = resource1;
//	}
	public Resource getResource2() {
		return resource2;
	}
//	public void setResource2(Resource resource2) {
//		this.resource2 = resource2;
//	}
	public Resource getResource3() {
		return resource3;
	}
//	public void setResource3(Resource resource3) {
//		this.resource3 = resource3;
//	}
	

}
