package com.javafortesters.chap005testwithourownclalles.domainobject.examples;

import com.javafortesters.domainobject.TestAppEnv;
import org.junit.Test;

public class TestAppEnvironmentTest {
	@Test
	public void canGetUrlStatically() {
		TestAppEnv.getUrl();
	}
}
