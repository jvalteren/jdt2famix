package org.moosetechnology.jdt2famix.injava.oneSample;

import static org.junit.Assert.*;

import org.junit.Test;
import org.moosetechnology.jdt2famix.samples.basic.VoidMethodsWithOneParameter;
import org.moosetechnology.model.famix.Parameter;
import org.moosetechnology.model.famix.PrimitiveType;

public class VoidMethodsWithOneParameterTest extends OneSampleTestCase {

	@Override
	protected Class<?> sampleClass() {
		return VoidMethodsWithOneParameter.class;
	}

	@Test
	public void publicStaticVoidWithStringParameter() {
		assertEquals(1, methodNamed("publicStaticVoidWithStringParameter").getParameters().size());
		Parameter parameter = methodNamed("publicStaticVoidWithStringParameter").getParameters().stream().findAny().get();
		assertEquals("s", parameter.getName());
		assertEquals("String", parameter.getDeclaredType().getName());
	}

	@Test
	public void protectedStaticVoidWithIntParameter() {
		assertEquals(1, methodNamed("protectedStaticVoidWithIntParameter").getParameters().size());
		Parameter parameter = methodNamed("protectedStaticVoidWithIntParameter").getParameters().stream().findAny().get();
		assertEquals("i", parameter.getName());
		assertEquals("int", parameter.getDeclaredType().getName());
		assertTrue(parameter.getDeclaredType() instanceof PrimitiveType);
	}

	@Test
	public void packageStaticVoidWithStringArrayParameter() {
		assertEquals(1, methodNamed("packageStaticVoidWithStringArrayParameter").getParameters().size());
		Parameter parameter = methodNamed("packageStaticVoidWithStringArrayParameter").getParameters().stream().findAny().get();
		assertEquals("s", parameter.getName());
		assertEquals("String[]", parameter.getDeclaredType().getName());
		assertTrue(parameter.getDeclaredType() instanceof org.moosetechnology.model.famix.Class);
	}

	@Test
	public void publicVoidWithIntArrayParameter() {
		assertEquals(1, methodNamed("publicVoidWithIntArrayParameter").getParameters().size());
		Parameter parameter = methodNamed("publicVoidWithIntArrayParameter").getParameters().stream().findAny().get();
		assertEquals("i", parameter.getName());
		assertEquals("int[]", parameter.getDeclaredType().getName());
		assertTrue(parameter.getDeclaredType() instanceof PrimitiveType);
	}
}
