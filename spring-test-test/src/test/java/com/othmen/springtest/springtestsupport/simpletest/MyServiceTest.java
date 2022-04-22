package com.othmen.springtest.springtestsupport.simpletest;

import com.othmen.springtest.springtestsupport.beans.MyBean;
import com.othmen.springtest.springtestsupport.beans.MyService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringJUnitConfig(classes = MyService.class)
public class MyServiceTest {

    @MockBean
    protected MyBean myBean;
    @Autowired
    protected MyService myService;
    @Autowired
    protected ApplicationContext context;

    @BeforeEach
    protected void initialize() {
        Mockito.when(myBean.getValue()).thenReturn("Mock value");
    }

    @Test
    void contextLoads() {
        assertNotNull(myBean);
        assertNotNull(myService);
    }

    @Test
    void testShowValue() {
        assertEquals("Mock value", myService.showValue());
    }
}
