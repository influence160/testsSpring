package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Tags;

@Component
public class MyComponentWithMetrics {
	protected Long mMetricsNumber = 12345L;
	protected List<String> mFruitList = new ArrayList<>();

	public MyComponentWithMetrics(final MeterRegistry inMeterRegistry) {
		mFruitList.add("banana");
		mFruitList.add("guava");
		mFruitList.add("lemon");
		mFruitList.add("orange");
		/* Register a custom metrics without tags that contains a long number. */
		inMeterRegistry.gauge("mycomponent.longnumber", Tags.empty(), mMetricsNumber);
		/*
		 * Register a custom metrics with one tag that represents the size of the
		 * fruitlist.
		 */
		inMeterRegistry.gaugeCollectionSize("mycomponent.fruitlist.size", Tags.of("id", "medium"), mFruitList);
	}
}