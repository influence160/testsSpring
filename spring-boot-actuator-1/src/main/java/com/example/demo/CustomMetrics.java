package com.example.demo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Tag;
import io.micrometer.core.instrument.Tags;
import io.micrometer.core.instrument.binder.MeterBinder;

//@Component
//public class CustomMetrics {
//
//	
//	public CustomMetrics(MeterRegistry meterRegistry) {
//		meterRegistry.counter("my-metrics", "count");
//	}
//}
//@Component
//ca veux pas marcher
public class CustomMetrics implements MeterBinder{
	
	Log log = LogFactory.getLog(CustomMetrics.class);
	
	int count = 0;
	
	private Set<Tag> tags ;
	
	public CustomMetrics() {
		Tag tag = Tag.of("foo", "count1");
		tags = Collections.singleton(tag);
	}

	@Override
	public void bindTo(MeterRegistry registry) {
		log.info("CustomMetrics.bindTo");
		registry.counter("my-metrics", "count");
		Counter c = Counter.builder("my-metrics").tags(tags).register(registry);
	}


}
