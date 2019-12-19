package com.saxon.testdemo.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class RegularDemo {

	@Test
	public void m() {
		final String APP_NAMESPACE_VALIDATOR = "[a-zA-Z0-9._-]+(?<!\\.(json|yml|yaml|xml|properties))$";
		String str = "ad234s";
		Pattern pattern = Pattern.compile(APP_NAMESPACE_VALIDATOR);
		Matcher matcher = pattern.matcher(str);
		System.out.println(matcher.matches());
		System.out.println(pattern.pattern());
	}
}
