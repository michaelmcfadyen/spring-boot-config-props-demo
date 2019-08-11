package com.example.demo.domain;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AcmePropretiesTest {

    @Autowired
    private AcmePropreties properties;

    @Test
    public void getOpScoringClusters() {
        Assert.assertEquals(2, properties.getList().size()); // FAIL!
    }
}