package com.javafortesters.chap005testwithourownclalles.domainobject.examples;

import com.javafortesters.domainobject.TestAppEnv;
import org.junit.Assert;
import org.junit.Test;

public class TestAppEnvironmentTest {
	@Test
	public void canGetUrlStatically() {
		Assert.assertEquals("Environment url should equal http://192.123.0.3:67", "http://192.123.0.3:67", TestAppEnv.getUrl());
	}
}
