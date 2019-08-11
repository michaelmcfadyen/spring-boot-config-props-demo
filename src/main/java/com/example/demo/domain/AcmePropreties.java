package com.example.demo.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties("acme")
public class AcmePropreties {

    private List<MyPojo> list;

    public List<MyPojo> getList() {
        return this.list;
    }

    public void setList(List<MyPojo> list) {
        this.list = list;
    }
}