package com.pipeline.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class PipelineHelloWorldTest {

	@Test
	public void test() {
		PipelineHelloWorld.main(null);
		assertEquals(true, true);
	}

}
