package com.example.condition;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SetDessertConfig.class)
public class SetDessertTest {
@Rule
public final SystemOutRule systemOutRule=new SystemOutRule().enableLog();
@Autowired
private SetDessert setDessert;
@Test
public void SetDessertNotNull() {
	assertNotNull(setDessert);
}
@Test
public void setDessert() {
	setDessert.eat();
	systemOutRule.getLog();
}
}
