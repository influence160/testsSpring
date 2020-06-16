package com.othmen.testspring.springcore.propertyeditor.t1;

import java.beans.PropertyEditor;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.othmen.testspring.springcore.propertyeditor.t1")
public class CustomEditorConfiguration {

	@Bean 
	static public CustomEditorConfigurer personEditorConfigurer() {
		CustomEditorConfigurer ec = new CustomEditorConfigurer();
		Map<Class<?>, Class<? extends PropertyEditor>> editors = new HashMap<Class<?>, Class<? extends PropertyEditor>>();
		editors.put(Person.class, Person.PersonPropertyEditor.class);
		ec.setCustomEditors(editors);
		return ec;
	}
	
//ca marche aussi comme ca
	@Bean 
	static public CustomEditorConfigurer animalEditorConfigurer() {
		CustomEditorConfigurer ec = new CustomEditorConfigurer();
//		PropertyEditorRegistrar registrator = new PropertyEditorRegistrar() {
//			
//			@Override
//			public void registerCustomEditors(PropertyEditorRegistry registry) {
//				registry.registerCustomEditor(Animal.class, new Animal.AnimalPropertyEditor());
//				
//			}
//		};
		PropertyEditorRegistrar registrator = animalEditorRegistrator();
		ec.setPropertyEditorRegistrars(new PropertyEditorRegistrar[] {registrator});
		return ec;
	}

	@Bean 
	static public PropertyEditorRegistrar animalEditorRegistrator() {
		PropertyEditorRegistrar registrator = new PropertyEditorRegistrar() {
			
			@Override
			public void registerCustomEditors(PropertyEditorRegistry registry) {
				registry.registerCustomEditor(Animal.class, new Animal.AnimalPropertyEditor());
				
			}
		};
		return registrator;
	}

}
