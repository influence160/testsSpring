package com.othmen.springtest.springtestsupport.beans.inheritance;

import org.springframework.stereotype.Component;

@Component
public class FirstOfKind extends AKindOfBeansParent {

    public String getValue() {
        return "{" + getSharedValue() + "}";
    }
}
