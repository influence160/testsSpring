package com.othmen.springtest.springtestsupport.inheritance;


import com.othmen.springtest.springtestsupport.beans.MyService;
import com.othmen.springtest.springtestsupport.beans.inheritance.SharedService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestPropertySource(properties = {
        "kind.value1=value1",
        "kind.value2=value2"
})
public class AKindOfBeansBaseTestClass {

    @MockBean
    protected SharedService sharedService;

    @Value("${kind.value1}")
    protected String value1;
    @Value("${kind.value2}")
    private String value2;

    @BeforeEach
    protected void setupParent() {
        System.out.println("setupParent");
        Mockito.when(sharedService.getSomethingFromConfigValues(value1, value2)).thenAnswer(args -> {
            System.out.println(String.format("call to sharedService.getSomethingFromConfigValues(%s, %s)", args.getArgument(0), args.getArgument(1)));
            return "Mock " + args.getArgument(0) + args.getArgument(1);
        });
    }

    @Test
    public void valuesSet() {
        System.out.println(String.format("valuesSet %s %s", value1, value2));
        assertNotNull(value1);
        assertNotNull(value2);
    }

    @Test
    void contextLoads() {
        System.out.println("sharedService = " + sharedService);
        assertNotNull(sharedService);
    }

}
