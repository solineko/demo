package com.example.demo;

import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="CDPlayerConfig.xml")
public class CDPlayerTest {
	@Rule
	public final SystemOutRule systemOutRule=new SystemOutRule().enableLog();
@Autowired
	private CompactDisc cd;
@Autowired
private CDPlayer player;
@Test
public void cdShouldNotNull() {
	assertNotNull(cd);
}
@Test
public void play() {
	player.play();
	systemOutRule.getLog();
}
}
