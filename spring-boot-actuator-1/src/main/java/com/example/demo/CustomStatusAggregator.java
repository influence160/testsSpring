package com.example.demo;

import java.util.Set;

import org.springframework.boot.actuate.health.SimpleStatusAggregator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.boot.actuate.health.StatusAggregator;
import org.springframework.stereotype.Component;

@Component
public class CustomStatusAggregator implements StatusAggregator {
	
	StatusAggregator simpleStatusAgregator = new SimpleStatusAggregator();

	@Override
	public Status getAggregateStatus(Set<Status> statuses) {
		System.out.println("getAggregateStatus " + statuses);
		return simpleStatusAgregator.getAggregateStatus(statuses);
	}

}
