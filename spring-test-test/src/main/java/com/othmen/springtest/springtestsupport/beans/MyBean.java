package com.othmen.springtest.springtestsupport.beans;

import org.springframework.stereotype.Component;

@Component
public class MyBean {

    public String getValue() {
        return "default value";
    }
}
