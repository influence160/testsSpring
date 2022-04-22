package com.othmen.springtest.springtestsupport.beans.inheritance;

import org.springframework.stereotype.Service;

@Service
public class SharedService {

    public String getSomethingFromConfigValues(String value1, String value2) {
        return value1 + value2;
    }
}
