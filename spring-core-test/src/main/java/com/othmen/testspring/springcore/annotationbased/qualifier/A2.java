package com.othmen.testspring.springcore.annotationbased.qualifier;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("a2")
public class A2 implements A {

	
}
