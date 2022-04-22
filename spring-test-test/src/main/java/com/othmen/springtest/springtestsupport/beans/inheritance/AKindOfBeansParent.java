package com.othmen.springtest.springtestsupport.beans.inheritance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public abstract class AKindOfBeansParent {

    @Value("${kind.value1}")
    protected String value1;
    @Value("${kind.value2}")
    private String value2;

    @Autowired SharedService sharedService;


    public String getSharedValue() {
        return sharedService.getSomethingFromConfigValues(value1, value2);
    }

    public abstract String getValue();

}
