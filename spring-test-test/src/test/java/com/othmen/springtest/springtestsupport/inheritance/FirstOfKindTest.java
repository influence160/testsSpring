package com.othmen.springtest.springtestsupport.inheritance;

import com.othmen.springtest.springtestsupport.beans.inheritance.FirstOfKind;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringJUnitConfig(classes = FirstOfKind.class)
public class FirstOfKindTest extends AKindOfBeansBaseTestClass {

    @Autowired
    FirstOfKind firstOfKind;

    @Test
    void testGetValue() {
        String value = firstOfKind.getValue();
        assertEquals("{Mock value1value2}", value);
    }
}
