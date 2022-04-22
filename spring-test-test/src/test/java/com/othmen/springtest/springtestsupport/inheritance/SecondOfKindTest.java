package com.othmen.springtest.springtestsupport.inheritance;

import com.othmen.springtest.springtestsupport.beans.inheritance.SecondOfKind;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringJUnitConfig(classes = SecondOfKind.class)
public class SecondOfKindTest extends AKindOfBeansBaseTestClass {

    @Autowired
    SecondOfKind secondOfKind;

    @Test
    void testGetValue() {
        String value = secondOfKind.getValue();
        assertEquals("[Mock value1value2]", value);
    }
}