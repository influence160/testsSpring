package com.othmen.springtest.springtestsupport.beans;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    private MyBean myBean;

    public MyService(MyBean myBean) {
        this.myBean = myBean;
    }

    public String showValue() {
        String value = myBean.getValue();
        System.out.println(value);
        return value;
    }
}
